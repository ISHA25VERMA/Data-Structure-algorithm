package DsAlgo.Graphs.Questions;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int req = image[sr][sc];
        int[][] visited = new int[image.length][image[0].length];
        visited[sr][sc] = 1;
        floodFillp(image, visited, sr, sc, color, req);
        return image;
    }

    private void floodFillp (int[][] image,int[][] visited, int sr, int sc, int color, int req){
        image[sr][sc] = color;
        visited[sr][sc] = 1;
        if(sr>0 && image[sr-1][sc]==req && visited[sr-1][sc] == 0){
            floodFillp(image, visited, sr-1, sc, color, req );
        }
        if(sr<image.length-1 &&image[sr+1][sc]==req && visited[sr+1][sc] == 0 ){
            floodFillp(image, visited, sr+1, sc, color, req );
        }
        if(sc>0 &&image[sr][sc-1]==req && visited[sr][sc-1] == 0  ){
            floodFillp(image, visited, sr, sc-1, color, req );
        }
        if(sc<image[sr].length-1 && image[sr][sc+1]==req && visited[sr][sc+1] == 0  ){
            floodFillp(image, visited, sr, sc+1, color, req );
        }
    }
}

public class FloodFillAlgorithm {
}
