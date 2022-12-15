class threeDArray{
    public static void main(String[] args) {
        String [][][] userData = {
            {
                {"names of the users "},
                {"anas ", "shuvo ", "babo "},
            },
            {
                {"emails of the users "},
                {"anas@gmail.com ", "shuvo@gmail.com ", "babo@gmail.com "},
            },
            {
                {"ages of the users "},
                {"5", "23", "20"},
            },
        };
        for (int i = 0; i < userData.length; i++){
            for (int j = 0; j < userData[i].length; i++){
                for (int m = 0; m < userData[i][j].length; m++){
                    System.out.println(userData[i][j][m]);
                }
            }
        }
    }
}