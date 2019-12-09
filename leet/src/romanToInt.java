import java.util.ArrayList;
import java.util.List;

public class romanToInt {
    public static int romanToInt(String s){
        int sumup = 0;
        int i = 0;
        while( i < s.length()){
            char getchar = s.charAt(i);

            switch (getchar)
            {
                case 'I':
                    i += 1;
                    if (i >= s.length()){
                        sumup += 1;
                        break;
                    }else {
                        char getchar_2 = s.charAt(i);
                        switch (getchar_2) {
                            case 'V':
                                sumup += 4;
                                i += 1;
                                break;
                            case 'X':
                                sumup += 9;
                                i += 1;
                                break;
                            default:
                                sumup += 1;
                                break;
                        }
                        break;
                    }


                case 'V':
                    i += 1;
                    sumup += 5;
                    break;
                case 'X':
                    i += 1;
                    char getchar_2 = s.charAt(i);
                    switch (getchar_2)
                    {
                        case 'L':
                            sumup += 40;
                            i += 1;
                            break;
                        case 'C':
                            sumup += 90;
                            i += 1;
                            break;
                        default:
                            sumup += 10;
                            break;
                    }
                case 'L':
                    i += 1;
                    sumup += 50;
                    break;
                case 'C':
                    i += 1;
                    char getchar_3 = s.charAt(i);
                    switch (getchar_3)
                    {
                        case 'D':
                            sumup += 400;
                            i += 1;
                            break;
                        case 'M':
                            sumup += 900;
                            i += 1;
                            break;
                        default:
                            sumup += 100;
                            break;
                    }
                case 'D':
                    sumup += 500;
                    break;
                case 'M':
                    sumup += 1000;
                    break;
                default:
                    System.out.println("invalid char");
            }


        }
        return sumup;
    }
}
