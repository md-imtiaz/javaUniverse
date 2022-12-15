class twoDArrays{
    public static void main(String[] args) {
        // declaration of 2D array
        // int[][] a = new int[3][4];
        // initialize a 2-dimensional array
        String[][] userInfo = {
            {"name ", "email "},
            {"shuvo ", "shuvo@gmail.com "},
        };
// System.out.print("name of user is: " + userInfo[1][0]);
// System.out.print("email of user is: " + userInfo[1][1]);
for (int i = 0; i < userInfo.length; ++i){
    for(int j = 0; j < userInfo[i].length; ++j){
        System.out.println(userInfo[i][j]);
    }
}
    }
}