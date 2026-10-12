package p3_upperBoundConstraints;

//anything below or at Number is accepted
public class Point3<T extends Number> {
    //we could also say extends Comparable<> if we wanted to compare objects ---
    // only which have already defined their compareTo
    //即lく技 師搾テク子 scus amic mij se t'telefon a chest ora ma sultant tu m'puo' capi'

    T x;
    T y;

    public Point3(T x,  T y){{
        //do THINGS
    }
        this.x = x;
        this.y = y;
    }
}

