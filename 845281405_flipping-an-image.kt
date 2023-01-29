id = 845281405 
lang = kotlin 
runtime  = 398 ms 
memory = 44.7 MB
title_slug = flipping-an-image
code =

 class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        
        for (i in 0 until image.size) {
            image[i].reverse()
            for (j in 0 until image.size) {
                if (image[i][j] == 0)
                    image[i][j] = 1
                else 
                    image[i][j] = 0
            }
        }
        
        return image
    }
}