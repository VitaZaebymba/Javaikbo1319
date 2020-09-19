package Lab3;

public class Human {
    Head Head;
    Hand LeftHand;
    Hand RightHand;
    Leg LeftLeg;
    Leg RightLeg;
    public Human(Head head, Leg Lleg,Leg Rleg, Hand Lhand,Hand Rhand){
        Head=head;
        LeftHand=Lhand;
        RightHand=Rhand;
        LeftLeg=Lleg;
        RightLeg=Rleg;
    }

    public Hand getLeftHand() {
        return LeftHand;
    }

    public Hand getRightHand() {
        return RightHand;
    }

    public Head getHead() {
        return Head;
    }

    public Leg getLeftLeg() {
        return LeftLeg;
    }

    public Leg getRightLeg() {
        return RightLeg;
    }

    public void setHead(Head head) {
        Head = head;
    }

    public void setLeftHand(Hand leftHand) {
        LeftHand = leftHand;
    }

    public void setLeftLeg(Leg leftLeg) {
        LeftLeg = leftLeg;

    }

    public void setRightHand(Hand rightHand) {
        RightHand = rightHand;
    }

    public void setRightLeg(Leg rightLeg) {
        RightLeg = rightLeg;
    }
}
