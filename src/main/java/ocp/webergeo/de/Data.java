package ocp.webergeo.de;

public enum Data {
    INTERNAl(0);
    int number;

    Data(Integer l){
        ++number;
    }
    Data(long l){
        --number;
    }
}
