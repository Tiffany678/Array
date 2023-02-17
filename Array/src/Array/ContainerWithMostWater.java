package Array;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height==null || height.length==1){
            return 0;
        }else if(height.length==2){
            return height[0]*height[1];
        }
        int maxOfShape= Integer.MIN_VALUE;
        int start =0;
        int end = height.length-1;

        while(end >start){
            int widthOfShape = end-start;
            int heightOfShape = Math.min(height[start], height[end]);
            int currentArea = area(widthOfShape, heightOfShape);
            maxOfShape= Math.max(maxOfShape, currentArea);

            if(height[start]>height[end]){
                end--;
            }else if(height[start]<height[end]){
                start++;
            }else{
                start++;
                end--;
            }

        }
        return maxOfShape;
    }

    public int area(int width, int height){
        return width*height;
    }
}
