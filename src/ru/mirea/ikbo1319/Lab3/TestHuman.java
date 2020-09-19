package Lab3;

public class TestHuman {
    public static void main(String[] args) {
        Leg LLeg=new Leg(45);
        Leg Rleg=new Leg(66);
       Hand LHand=new Hand(23);
        Hand RHand=new Hand(90);
       Head head=new Head(81);
        Human human=new Human(head,LLeg,Rleg,LHand,RHand);
        System.out.println(human.getHead());
        System.out.println(human.getLeftHand()+" "+human.getRightHand());
        System.out.println(human.getLeftLeg()+" "+human.getRightLeg());
        LLeg.setHealth(100);
        LHand.setHealth(100);
        RHand.setHealth(100);
        Rleg.setHealth(100);
        head.setHealth(100);
        System.out.println(human.getHead());
        System.out.println(human.getLeftHand()+" "+human.getRightHand());
        System.out.println(human.getLeftLeg()+" "+human.getRightLeg());
    }
}
