class ManipRobot{
    public static void main(String[] args){
        Robot robot1 = new Robot("Toto", 10, 20, Robot.SUD);
        Robot robot2 = new Robot("Titi");
        robot2.modifOrientation(Robot.SUD);
        robot1.deplacer();
        robot2.deplacer();
        System.out.println(robot1);
        //robot1.afficheToi();
        //robot2.afficheToi();
    }
}