package app;

public class Gates {

    Gates Gate;

    interface Logics extends Gate{

    }
    class GateAND implements Logics{
        private int In1;
        private int In2;
        private int Out;

        public void setIn1(int In1) {
            this.In1 = In1;
        }
        @Override
        public int getIn1() {
            return In1;
        }
        @Override
        public int getIn2() {
            return In2;

        }
        @Override
        public int getOut() {
            return Out;


        }
        @Override
        public void setIn2(int In2) {
            this.In2 = In2;


        }
        @Override
        public void setOut(int In1, int In2) {
            int Val = 0;
            if (In1 == 1 && In2 == 1) {
                Val = 1;
            }
            this.Out = Val;


        }
    }
    static class GateOR implements Logics {
        private int In1;
        private int In2;
        private int Out;

        public void setIn1(int In1) {
            this.In1 = In1;
        }

        @Override
        public void setIn2(int In2) {
            this.In2 = In2;

        }

        @Override
        public int getIn1() {
            return In1;
        }
        @Override
        public int getIn2() {
            return In2;

        }
        @Override
        public int getOut() {
            return Out;


        }
        @Override
        public void setOut(int In1, int In2) {
            int Val = 0;
            if (In1 == 1 || In2 == 1) {
                Val = 1;
            }
            this.Out = Val;


        }
    }
    class GateNOT implements Logics{
        private int In1;
        private int In2;
        private int Out;

        public void setIn1(int In1) {
            this.In1 = In1;
        }
        @Override
        public int getIn1() {
            return In1;
        }
        @Override
        public int getIn2() {
            return In2;

        }
        @Override
        public int getOut() {
            return Out;


        }
        @Override
        public void setIn2(int In2) {
            this.In2 = In2;


        }
        @Override
        public void setOut(int In1, int In2) {
            int Val = 0;
            if (In1 == 1) {
                Val = 0;
            }else {
                Val = 1;
            }
            this.Out = Val;


        }
    }
    static class GateXOR implements Logics{
        private int In1;
        private int In2;
        private int Out;

        public void setIn1(int In1) {
            this.In1 = In1;
        }
        @Override
        public int getIn1() {
            return In1;
        }
        @Override
        public int getIn2() {
            return In2;

        }
        @Override
        public int getOut() {
            return Out;


        }
        @Override
        public void setIn2(int In2) {
            this.In2 = In2;


        }
        @Override
        public void setOut(int In1, int In2) {
            int Val = 0;
            if((In1 == 1 && In2 == 0) || (In1 == 0 && In2 == 1)) {
                Val = 1;
            }
            this.Out = Val;


        }
    }
    static class GateXNOR implements Logics{
        private int In1;
        private int In2;
        private int Out;

        public void setIn1(int In1) {
            this.In1 = In1;
        }
        @Override
        public int getIn1() {
            return In1;
        }
        @Override
        public int getIn2() {
            return In2;

        }
        @Override
        public int getOut() {
            return Out;


        }
        @Override
        public void setIn2(int In2) {
            this.In2 = In2;


        }
        @Override
        public void setOut(int In1, int In2) {
            int Val = 1;
            if((In1 == 1 && In2 == 0) || (In1 == 0 && In2 == 1)) {
                Val = 0;
            }
            this.Out = Val;


        }
    }
    static class GateNAND implements Logics{
        private int In1;
        private int In2;
        private int Out;

        public void setIn(int In1) {
            this.In1 = In1;
        }
        @Override
        public int getIn1() {
            return In1;
        }
        @Override
        public int getIn2() {
            return In2;

        }
        @Override
        public int getOut() {
            return Out;


        }

        @Override
        public void setIn1(int In1) {

        }

        @Override
        public void setIn2(int In2) {
            this.In2 = In2;


        }
        @Override
        public void setOut(int In1, int In2) {
            int Val = 1;
            if(In1 == 1 && In2 == 1) {
                Val = 0;
            }
            this.Out = Val;


        }
    }
    static class GateNOR implements Logics{
        private int In1;
        private int In2;
        private int Out;

        public void setIn1(int In1) {
            this.In1 = In1;
        }
        @Override
        public int getIn1() {
            return In1;
        }
        @Override
        public int getIn2() {
            return In2;

        }
        @Override
        public int getOut() {
            return Out;


        }
        @Override
        public void setIn2(int In2) {
            this.In2 = In2;


        }
        @Override
        public void setOut(int In1, int In2) {
            int Val = 1;
            if(In1 == 1 || In2 == 1) {
                Val = 0;
            }
            this.Out = Val;

        }
    }
    public void setLogic(Gates Gate, GEnum type , int In1, int In2) {
        if(type == GEnum.AND ) {
            GateAND GateAND = new GateAND();
            GateAND.setIn1(In1);
            GateAND.setIn2(In2);
            GateAND.setOut(GateAND.getIn1(), GateAND.getIn2());
            System.out.println("AND Output = " + GateAND.getOut());

        }else if(type == GEnum.OR) {
            GateOR GateOR = new GateOR();
            GateOR.setIn1(In1);
            GateOR.setIn2(In2);
            GateOR.setOut(GateOR.getIn1(), GateOR.getIn2());
            System.out.println("OR Output = " + GateOR.getOut());

        }else if(type == GEnum.NOR) {
            GateNOR GateNOR = new GateNOR();
            GateNOR.setIn1(In1);
            GateNOR.setIn2(In2);
            GateNOR.setOut(GateNOR.getIn1(), GateNOR.getIn2());
            System.out.println("NOR Output = " + GateNOR.getOut());

        }else if(type == GEnum.XNOR) {
            GateXNOR GateXNOR = new GateXNOR();
            GateXNOR.setIn1(In1);
            GateXNOR.setIn2(In2);
            GateXNOR.setOut(GateXNOR.getIn1(), GateXNOR.getIn2());
            System.out.println("XNOR Output = " + GateXNOR.getOut());

        }else if(type == GEnum.XOR) {
            GateXOR GateXOR = new GateXOR();
            GateXOR.setIn1(In1);
            GateXOR.setIn2(In2);
            GateXOR.setOut(GateXOR.getIn1(), GateXOR.getIn2());
            System.out.println("XOR Output = " + GateXOR.getOut());

        }else if(type == GEnum.NOT) {
            GateNOT GateNOT = new GateNOT();
            GateNOT.setIn1(In1);
            GateNOT.setIn2(In2);
            GateNOT.setOut(GateNOT.getIn1(), GateNOT.getIn2());
            System.out.println("NOT Output = " + GateNOT.getOut());

        }else if(type == GEnum.NAND) {
            GateNAND GateNAND = new GateNAND();
            GateNAND.setIn1(In1);
            GateNAND.setIn2(In2);
            GateNAND.setOut(GateNAND.getIn1(), GateNAND.getIn2());
            System.out.println("NAND Output = " + GateNAND.getOut());

        }
        this.Gate = Gate;
    }

    enum GEnum{
        AND, OR, NOT, NOR, XNOR, XOR, NAND
    }

    public Gates getGate() {
        return Gate;
    }

}
