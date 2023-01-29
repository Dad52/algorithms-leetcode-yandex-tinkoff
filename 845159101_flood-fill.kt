id = 845159101 
lang = kotlin 
runtime  = 442 ms 
memory = 46.4 MB
title_slug = flood-fill
code =

 class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        
        for (i in 0 until image.size) {
            for (j in 0 until image[0].size) {
                if (i == sr && j == sc)
                    dfs(image, color, i, j, image[i][j])
            }
        }
        
        for (i in 0 until image.size) {
            for (j in 0 until image[0].size) {
                if (image[i][j] == -1)
                    image[i][j] = color
            }
        }
        
        return image
        
    }
    
    fun dfs(image: Array<IntArray>, color: Int, i: Int, j: Int, startColor: Int) {
        
        if (i < 0 || i >= image.size || j < 0 || j >= image[i].size)
            return
        
        if (image[i][j] != startColor)
            return
        
        if (image[i][j] == startColor)
            image[i][j] = -1
        
        dfs(image, color, i + 1, j, startColor)
        dfs(image, color, i - 1, j, startColor)
        dfs(image, color, i, j + 1, startColor)
        dfs(image, color, i, j - 1, startColor)

    }
}
