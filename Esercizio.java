/public static void assegnaMatrice(int[]M,int nR,int nC,int v ) {
        i=0;
        j=0;
        for(i=0; i <= nR; ++1){
            for(j=0; j<= nC; ++j ){
                M[i][j]=v;
            }
        }
    }

    public static void azzeraMatrice(int[]M,int nR,int nC ) {
        assegnaMatrice (M,nC,nR,D);
    }

    public static void riempiCasuale(int[]M,int nR,int nC,int valoreMax,int valoreMin) {
        Random rand = new Random();
        int i=0;
        while(i <= Nr-1){
            int j=0;
            while(j <= Nc-1){
                int r=rand.nextInt(valoreMax+1-valoreMin/valoreMin);
                M[i][j]=r;
                ++j;
            }
            ++i;
        }
    }



