package org.example.BehavioralPatterns.Iterator;

public class TestAgregate implements Collection<TestAgregate,String> {

    private String firstValue;
    private String secondValue;
    private String thirdValue;

    private String getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = firstValue;
    }

    private String getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(String secondValue) {
        this.secondValue = secondValue;
    }

    private String getThirdValue() {
        return thirdValue;
    }

    public void setThirdValue(String thirdValue) {
        this.thirdValue = thirdValue;
    }

    @Override
    public Iterator<String> getIterator(TestAgregate collection) {
        return new TestIterator(collection);
    }


    public static class TestIterator implements Iterator<String>  {
        private final TestAgregate testAgregate;

        private int index;
        private TestIterator(TestAgregate testAgregate) {
            this.testAgregate = testAgregate;
            this.index = 0;
        }


        @Override
        public void first() {
            index = 0;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public boolean isDone() {
            return traverseObject(index) == null;
        }

        @Override
        public String currentItem() {
            return traverseObject(index);
        }

        private String traverseObject(int index){
            return switch (index) {
                case 0 -> testAgregate.firstValue;
                case 1 -> testAgregate.secondValue;
                case 2 -> testAgregate.thirdValue;
                default -> null;
            };
        }
    };
}
