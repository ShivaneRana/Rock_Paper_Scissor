class uwu{

    private int score;
    private int round = 1;
    private int comscore;

    private String x = "*";
    private String repeated = x.repeat(100);
    public void pattern(){
        System.out.println(repeated);
    }
    public void displayscore(){
        System.out.println("User Score: "+score);
    }

    public void displayCompscore(){
        System.out.println("Computer Score: "+comscore);
    }
    public void one(){
        System.out.println("User choose Rock");
    }

    public void two(){
        System.out.println("User choose Paper");
    }

    public void three(){
        System.out.println("User choose Scissor");
    }

    public void displaycompchoice(int comp){
        if(comp == 1){
            System.out.println("Computer has choosen Rock");
        }else if(comp == 2){
            System.out.println("Computer has choosen Paper");
        }else if(comp == 3){
            System.out.println("Computer has choosen Scissor");
        }
    }

    public void displayuserchoice(int input){
        if(input == 1){
            System.out.println("User has choosen Rock");
        }else if(input == 2){
            System.out.println("User has choosen Paper");
        }else if(input == 3){
            System.out.println("User has choosen Scissor");
        }
    }
    public void compare(int input,int comp){
        if(input == comp){
            System.out.println("Draw!!!!");
            round++;
            displayuserchoice(input);
            displaycompchoice(comp);
            displayscore();
            displayCompscore();
            pattern();
        } else if (input == 1 && comp != 2) {
            System.out.println("Use won");
            score++;
            round++;
            displayuserchoice(input);
            displaycompchoice(comp);
            displayscore();
            displayCompscore();
            pattern();
        } else if (input == 2 && comp != 3) {
            System.out.println("User won");
            score++;
            round++;
            displayuserchoice(input);
            displaycompchoice(comp);
            displayscore();
            displayCompscore();
            pattern();
        } else if(input == 3 && comp != 1){
            System.out.println("User won");
            score++;
            round++;
            displayuserchoice(input);
            displaycompchoice(comp);
            displayscore();
            displayCompscore();
            pattern();
        }else if(input == 4){
          System.out.println("The Game is shutting down");
          System.out.println("Thanks for playing");
          System.exit(0);

        } else{
            System.out.println("Compute has won");
            comscore++;
            round++;
            displayuserchoice(input);
            displaycompchoice(comp);
            displayscore();
            displayCompscore();
            pattern();
        }}

        public void display(){
        pattern();
            System.out.println("This game is of 5 Round");
            System.out.println("currently at Round: "+round);
            System.out.println("This is a Rock,Paper and Scissor game");
            System.out.println("1.Rock");
            System.out.println("2.Paper");
            System.out.println("3.Scissor");
            System.out.println("4.Exit");
    }

    }
