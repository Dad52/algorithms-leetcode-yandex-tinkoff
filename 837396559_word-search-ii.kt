id = 837396559 
lang = kotlin 
runtime  = 2620 ms 
memory = 715.9 MB
title_slug = word-search-ii
code =

 //FOR CHALLENGE, NOT MINE
class Node(var c:Char){
    var isLeaf:Boolean;
    var child:Array<Node?>
    init{
        isLeaf=false;
        child=arrayOfNulls(26);
    }
}
fun Node?.insert(word:String){
    var cur=this
    var n:Int=word.length;
    for(i in 0..(n-1)){
        var c:Char=word[i];
        if((cur!!.child[c-'a']==null)){
           cur.child[(c-'a')]=Node(c) 
        }
        cur=cur.child[c-'a']!!
    }
    cur!!.isLeaf=true
}
fun valid(x:Int,y:Int,board:Array<CharArray>):Boolean{
    if(x<0 || y<0 || x>=board.size || y>=board[0].size) return false
    else if(board[x][y]=='0')return false
    return true
}
fun Node?.dfs(x:Int,y:Int,board:Array<CharArray>,res:MutableList<String>,cur:String){
    if(this==null)return
    if(valid(x,y,board)==false) return 
     var temp:Char=board[x][y]
    if(this.child[temp-'a']!=null && this.child[temp-'a']!!.isLeaf) {
        res.add(cur+temp)
        this.child[temp-'a']!!.isLeaf=false
    }
    board[x][y]='0'
    this.child[temp-'a'].dfs(x-1,y,board,res,cur+temp)
    this.child[temp-'a'].dfs(x+1,y,board,res,cur+temp)
    this.child[temp-'a'].dfs(x,y-1,board,res,cur+temp)
    this.child[temp-'a'].dfs(x,y+1,board,res,cur+temp)
    board[x][y]=temp
}
class Solution {
    fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
        var root=Node('$')
        for(i in 0..(words.size-1)){
            root.insert(words[i])
        }
        var res:MutableList<String> =mutableListOf()
        for(i in 0..(board.size-1)){
            for(j in 0..(board[i].size-1)){
                root.dfs(i,j,board,res,"")
            }
        }
        return res.toList()
    }
}