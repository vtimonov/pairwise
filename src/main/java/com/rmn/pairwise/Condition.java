package com.rmn.pairwise;

/**
 * Created by ${Timonov_Viacheslav} on 6/20/18.
 */
public class Condition {

    private int condition;
    private String nameOne;
    private String valueOne;
    private String nameTwo;
    private String valueTwo;

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public String getNameOne() {
        return nameOne;
    }

    public void setNameOne(String nameOne) {
        this.nameOne = nameOne;
    }

    public String getValueOne() {
        return valueOne;
    }

    public void setValueOne(String valueOne) {
        this.valueOne = valueOne;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    public void setNameTwo(String nameTwo) {
        this.nameTwo = nameTwo;
    }

    public String getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(String valueTwo) {
        this.valueTwo = valueTwo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Condition)) return false;

        Condition condition1 = (Condition) o;

        if (condition != condition1.condition) return false;
        if (nameOne != null ? !nameOne.equals(condition1.nameOne) : condition1.nameOne != null) return false;
        if (valueOne != null ? !valueOne.equals(condition1.valueOne) : condition1.valueOne != null) return false;
        if (nameTwo != null ? !nameTwo.equals(condition1.nameTwo) : condition1.nameTwo != null) return false;
        return valueTwo != null ? valueTwo.equals(condition1.valueTwo) : condition1.valueTwo == null;
    }

    @Override
    public int hashCode() {
        int result = condition;
        result = 31 * result + (nameOne != null ? nameOne.hashCode() : 0);
        result = 31 * result + (valueOne != null ? valueOne.hashCode() : 0);
        result = 31 * result + (nameTwo != null ? nameTwo.hashCode() : 0);
        result = 31 * result + (valueTwo != null ? valueTwo.hashCode() : 0);
        return result;
    }
}
