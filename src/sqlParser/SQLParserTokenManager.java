/* Generated By:JJTree&JavaCC: Do not edit this line. SQLParserTokenManager.java */
package sqlParser;
/** Token Manager. */
public class SQLParserTokenManager implements SQLParserConstants
{

    /** Debug output. */
    public  java.io.PrintStream debugStream = System.out;
    /** Set debug output. */
    public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
    private final int jjStopStringLiteralDfa_0(int pos, long active0)
    {
        switch (pos)
        {
            case 0:
                if ((active0 & 0xffffffe0L) != 0L)
                {
                    jjmatchedKind = 50;
                    return 5;
                }
                return -1;
            case 1:
                if ((active0 & 0xf67fffe0L) != 0L)
                {
                    if (jjmatchedPos != 1)
                    {
                        jjmatchedKind = 50;
                        jjmatchedPos = 1;
                    }
                    return 5;
                }
                if ((active0 & 0x9800000L) != 0L)
                    return 5;
                return -1;
            case 2:
                if ((active0 & 0xe2ebefe0L) != 0L)
                {
                    if (jjmatchedPos != 2)
                    {
                        jjmatchedKind = 50;
                        jjmatchedPos = 2;
                    }
                    return 5;
                }
                if ((active0 & 0x14141000L) != 0L)
                    return 5;
                return -1;
            case 3:
                if ((active0 & 0x82a9cfe0L) != 0L)
                {
                    jjmatchedKind = 50;
                    jjmatchedPos = 3;
                    return 5;
                }
                if ((active0 & 0x60462000L) != 0L)
                    return 5;
                return -1;
            case 4:
                if ((active0 & 0x8228cfa0L) != 0L)
                {
                    jjmatchedKind = 50;
                    jjmatchedPos = 4;
                    return 5;
                }
                if ((active0 & 0x810040L) != 0L)
                    return 5;
                return -1;
            case 5:
                if ((active0 & 0x200f80L) != 0L)
                {
                    jjmatchedKind = 50;
                    jjmatchedPos = 5;
                    return 5;
                }
                if ((active0 & 0x8208c020L) != 0L)
                    return 5;
                return -1;
            case 6:
                if ((active0 & 0x200600L) != 0L)
                {
                    jjmatchedKind = 50;
                    jjmatchedPos = 6;
                    return 5;
                }
                if ((active0 & 0x980L) != 0L)
                    return 5;
                return -1;
            case 7:
                if ((active0 & 0x200L) != 0L)
                {
                    jjmatchedKind = 50;
                    jjmatchedPos = 7;
                    return 5;
                }
                if ((active0 & 0x200400L) != 0L)
                    return 5;
                return -1;
            case 8:
                if ((active0 & 0x200L) != 0L)
                {
                    jjmatchedKind = 50;
                    jjmatchedPos = 8;
                    return 5;
                }
                return -1;
            default :
                return -1;
        }
    }
    private final int jjStartNfa_0(int pos, long active0)
    {
        return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
    }
    private int jjStopAtPos(int pos, int kind)
    {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        return pos + 1;
    }
    private int jjMoveStringLiteralDfa0_0()
    {
        switch(curChar)
        {
            case 34:
                return jjStopAtPos(0, 46);
            case 39:
                return jjStopAtPos(0, 47);
            case 40:
                return jjStopAtPos(0, 36);
            case 41:
                return jjStopAtPos(0, 37);
            case 42:
                return jjStopAtPos(0, 41);
            case 43:
                return jjStopAtPos(0, 39);
            case 44:
                return jjStopAtPos(0, 33);
            case 45:
                return jjStopAtPos(0, 40);
            case 46:
                return jjStopAtPos(0, 43);
            case 47:
                return jjStopAtPos(0, 42);
            case 58:
                return jjStopAtPos(0, 35);
            case 59:
                return jjStopAtPos(0, 34);
            case 60:
                return jjStopAtPos(0, 45);
            case 61:
                return jjStopAtPos(0, 38);
            case 62:
                return jjStopAtPos(0, 44);
            case 95:
                return jjStopAtPos(0, 32);
            case 65:
            case 97:
                return jjMoveStringLiteralDfa1_0(0x4000000L);
            case 66:
            case 98:
                return jjMoveStringLiteralDfa1_0(0x1000000L);
            case 67:
            case 99:
                return jjMoveStringLiteralDfa1_0(0x20000820L);
            case 68:
            case 100:
                return jjMoveStringLiteralDfa1_0(0xc0202000L);
            case 70:
            case 102:
                return jjMoveStringLiteralDfa1_0(0x20100L);
            case 73:
            case 105:
                return jjMoveStringLiteralDfa1_0(0x10048000L);
            case 75:
            case 107:
                return jjMoveStringLiteralDfa1_0(0x1000L);
            case 76:
            case 108:
                return jjMoveStringLiteralDfa1_0(0x400000L);
            case 79:
            case 111:
                return jjMoveStringLiteralDfa1_0(0x8800000L);
            case 80:
            case 112:
                return jjMoveStringLiteralDfa1_0(0x80L);
            case 82:
            case 114:
                return jjMoveStringLiteralDfa1_0(0x600L);
            case 83:
            case 115:
                return jjMoveStringLiteralDfa1_0(0x104000L);
            case 84:
            case 116:
                return jjMoveStringLiteralDfa1_0(0x40L);
            case 85:
            case 117:
                return jjMoveStringLiteralDfa1_0(0x80000L);
            case 86:
            case 118:
                return jjMoveStringLiteralDfa1_0(0x2000000L);
            case 87:
            case 119:
                return jjMoveStringLiteralDfa1_0(0x10000L);
            default :
                return jjMoveNfa_0(0, 0);
        }
    }
    private int jjMoveStringLiteralDfa1_0(long active0)
    {
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(0, active0);
            return 1;
        }
        switch(curChar)
        {
            case 65:
            case 97:
                return jjMoveStringLiteralDfa2_0(active0, 0x42000840L);
            case 69:
            case 101:
                return jjMoveStringLiteralDfa2_0(active0, 0x80105600L);
            case 72:
            case 104:
                return jjMoveStringLiteralDfa2_0(active0, 0x20010000L);
            case 73:
            case 105:
                return jjMoveStringLiteralDfa2_0(active0, 0x600000L);
            case 78:
            case 110:
                return jjMoveStringLiteralDfa2_0(active0, 0x14048000L);
            case 79:
            case 111:
                return jjMoveStringLiteralDfa2_0(active0, 0x100L);
            case 80:
            case 112:
                return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
            case 82:
            case 114:
                if ((active0 & 0x8000000L) != 0L)
                {
                    jjmatchedKind = 27;
                    jjmatchedPos = 1;
                }
                return jjMoveStringLiteralDfa2_0(active0, 0x8220a0L);
            case 89:
            case 121:
                if ((active0 & 0x1000000L) != 0L)
                    return jjStartNfaWithStates_0(1, 24, 5);
                break;
            default :
                break;
        }
        return jjStartNfa_0(0, active0);
    }
    private int jjMoveStringLiteralDfa2_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(0, old0);
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(1, active0);
            return 2;
        }
        switch(curChar)
        {
            case 65:
            case 97:
                return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
            case 66:
            case 98:
                return jjMoveStringLiteralDfa3_0(active0, 0x40L);
            case 68:
            case 100:
                if ((active0 & 0x4000000L) != 0L)
                    return jjStartNfaWithStates_0(2, 26, 5);
                return jjMoveStringLiteralDfa3_0(active0, 0x880000L);
            case 69:
            case 101:
                return jjMoveStringLiteralDfa3_0(active0, 0x10020L);
            case 70:
            case 102:
                return jjMoveStringLiteralDfa3_0(active0, 0x200L);
            case 73:
            case 105:
                return jjMoveStringLiteralDfa3_0(active0, 0x80L);
            case 75:
            case 107:
                return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
            case 76:
            case 108:
                return jjMoveStringLiteralDfa3_0(active0, 0x82004000L);
            case 79:
            case 111:
                return jjMoveStringLiteralDfa3_0(active0, 0x22000L);
            case 82:
            case 114:
                return jjMoveStringLiteralDfa3_0(active0, 0x100L);
            case 83:
            case 115:
                return jjMoveStringLiteralDfa3_0(active0, 0x208c00L);
            case 84:
            case 116:
                if ((active0 & 0x100000L) != 0L)
                    return jjStartNfaWithStates_0(2, 20, 5);
                else if ((active0 & 0x10000000L) != 0L)
                {
                    jjmatchedKind = 28;
                    jjmatchedPos = 2;
                }
                return jjMoveStringLiteralDfa3_0(active0, 0x40040000L);
            case 89:
            case 121:
                if ((active0 & 0x1000L) != 0L)
                    return jjStartNfaWithStates_0(2, 12, 5);
                break;
            default :
                break;
        }
        return jjStartNfa_0(1, active0);
    }
    private int jjMoveStringLiteralDfa3_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(1, old0);
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(2, active0);
            return 3;
        }
        switch(curChar)
        {
            case 65:
            case 97:
                return jjMoveStringLiteralDfa4_0(active0, 0x80020L);
            case 67:
            case 99:
                return jjMoveStringLiteralDfa4_0(active0, 0x800L);
            case 69:
            case 101:
                if ((active0 & 0x400000L) != 0L)
                    return jjStartNfaWithStates_0(3, 22, 5);
                else if ((active0 & 0x40000000L) != 0L)
                    return jjStartNfaWithStates_0(3, 30, 5);
                return jjMoveStringLiteralDfa4_0(active0, 0x8080c300L);
            case 76:
            case 108:
                return jjMoveStringLiteralDfa4_0(active0, 0x40L);
            case 77:
            case 109:
                if ((active0 & 0x20000L) != 0L)
                    return jjStartNfaWithStates_0(3, 17, 5);
                return jjMoveStringLiteralDfa4_0(active0, 0x80L);
            case 79:
            case 111:
                if ((active0 & 0x40000L) != 0L)
                    return jjStartNfaWithStates_0(3, 18, 5);
                break;
            case 80:
            case 112:
                if ((active0 & 0x2000L) != 0L)
                    return jjStartNfaWithStates_0(3, 13, 5);
                break;
            case 82:
            case 114:
                if ((active0 & 0x20000000L) != 0L)
                    return jjStartNfaWithStates_0(3, 29, 5);
                return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
            case 84:
            case 116:
                return jjMoveStringLiteralDfa4_0(active0, 0x200400L);
            case 85:
            case 117:
                return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
            default :
                break;
        }
        return jjStartNfa_0(2, active0);
    }
    private int jjMoveStringLiteralDfa4_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(2, old0);
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(3, active0);
            return 4;
        }
        switch(curChar)
        {
            case 65:
            case 97:
                return jjMoveStringLiteralDfa5_0(active0, 0x880L);
            case 67:
            case 99:
                return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
            case 69:
            case 101:
                if ((active0 & 0x40L) != 0L)
                    return jjStartNfaWithStates_0(4, 6, 5);
                else if ((active0 & 0x10000L) != 0L)
                    return jjStartNfaWithStates_0(4, 16, 5);
                return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
            case 73:
            case 105:
                return jjMoveStringLiteralDfa5_0(active0, 0x200100L);
            case 82:
            case 114:
                if ((active0 & 0x800000L) != 0L)
                    return jjStartNfaWithStates_0(4, 23, 5);
                return jjMoveStringLiteralDfa5_0(active0, 0x8600L);
            case 84:
            case 116:
                return jjMoveStringLiteralDfa5_0(active0, 0x80080020L);
            default :
                break;
        }
        return jjStartNfa_0(3, active0);
    }
    private int jjMoveStringLiteralDfa5_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(3, old0);
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(4, active0);
            return 5;
        }
        switch(curChar)
        {
            case 68:
            case 100:
                return jjMoveStringLiteralDfa6_0(active0, 0x800L);
            case 69:
            case 101:
                if ((active0 & 0x20L) != 0L)
                    return jjStartNfaWithStates_0(5, 5, 5);
                else if ((active0 & 0x80000L) != 0L)
                    return jjStartNfaWithStates_0(5, 19, 5);
                else if ((active0 & 0x80000000L) != 0L)
                    return jjStartNfaWithStates_0(5, 31, 5);
                return jjMoveStringLiteralDfa6_0(active0, 0x200L);
            case 71:
            case 103:
                return jjMoveStringLiteralDfa6_0(active0, 0x100L);
            case 73:
            case 105:
                return jjMoveStringLiteralDfa6_0(active0, 0x400L);
            case 78:
            case 110:
                return jjMoveStringLiteralDfa6_0(active0, 0x200000L);
            case 82:
            case 114:
                return jjMoveStringLiteralDfa6_0(active0, 0x80L);
            case 83:
            case 115:
                if ((active0 & 0x2000000L) != 0L)
                    return jjStartNfaWithStates_0(5, 25, 5);
                break;
            case 84:
            case 116:
                if ((active0 & 0x4000L) != 0L)
                    return jjStartNfaWithStates_0(5, 14, 5);
                else if ((active0 & 0x8000L) != 0L)
                    return jjStartNfaWithStates_0(5, 15, 5);
                break;
            default :
                break;
        }
        return jjStartNfa_0(4, active0);
    }
    private int jjMoveStringLiteralDfa6_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(4, old0);
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(5, active0);
            return 6;
        }
        switch(curChar)
        {
            case 67:
            case 99:
                return jjMoveStringLiteralDfa7_0(active0, 0x200400L);
            case 69:
            case 101:
                if ((active0 & 0x800L) != 0L)
                    return jjStartNfaWithStates_0(6, 11, 5);
                break;
            case 78:
            case 110:
                if ((active0 & 0x100L) != 0L)
                    return jjStartNfaWithStates_0(6, 8, 5);
                return jjMoveStringLiteralDfa7_0(active0, 0x200L);
            case 89:
            case 121:
                if ((active0 & 0x80L) != 0L)
                    return jjStartNfaWithStates_0(6, 7, 5);
                break;
            default :
                break;
        }
        return jjStartNfa_0(5, active0);
    }
    private int jjMoveStringLiteralDfa7_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(5, old0);
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(6, active0);
            return 7;
        }
        switch(curChar)
        {
            case 67:
            case 99:
                return jjMoveStringLiteralDfa8_0(active0, 0x200L);
            case 84:
            case 116:
                if ((active0 & 0x400L) != 0L)
                    return jjStartNfaWithStates_0(7, 10, 5);
                else if ((active0 & 0x200000L) != 0L)
                    return jjStartNfaWithStates_0(7, 21, 5);
                break;
            default :
                break;
        }
        return jjStartNfa_0(6, active0);
    }
    private int jjMoveStringLiteralDfa8_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(6, old0);
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(7, active0);
            return 8;
        }
        switch(curChar)
        {
            case 69:
            case 101:
                return jjMoveStringLiteralDfa9_0(active0, 0x200L);
            default :
                break;
        }
        return jjStartNfa_0(7, active0);
    }
    private int jjMoveStringLiteralDfa9_0(long old0, long active0)
    {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(7, old0);
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(8, active0);
            return 9;
        }
        switch(curChar)
        {
            case 83:
            case 115:
                if ((active0 & 0x200L) != 0L)
                    return jjStartNfaWithStates_0(9, 9, 5);
                break;
            default :
                break;
        }
        return jjStartNfa_0(8, active0);
    }
    private int jjStartNfaWithStates_0(int pos, int kind, int state)
    {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) { return pos + 1; }
        return jjMoveNfa_0(state, pos + 1);
    }
    private int jjMoveNfa_0(int startState, int curPos)
    {
        int startsAt = 0;
        jjnewStateCnt = 5;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;)
        {
            if (++jjround == 0x7fffffff)
                ReInitRounds();
            if (curChar < 64)
            {
                long l = 1L << curChar;
                do
                {
                    switch(jjstateSet[--i])
                    {
                        case 5:
                            if ((0x3ff000000000000L & l) != 0L)
                            {
                                if (kind > 50)
                                    kind = 50;
                                jjCheckNAdd(4);
                            }
                            if ((0x3ff000000000000L & l) != 0L)
                                jjCheckNAddTwoStates(3, 4);
                            break;
                        case 0:
                            if ((0x3fe000000000000L & l) == 0L)
                                break;
                            if (kind > 48)
                                kind = 48;
                            jjCheckNAdd(1);
                            break;
                        case 1:
                            if ((0x3ff000000000000L & l) == 0L)
                                break;
                            if (kind > 48)
                                kind = 48;
                            jjCheckNAdd(1);
                            break;
                        case 3:
                            if ((0x3ff000000000000L & l) != 0L)
                                jjCheckNAddTwoStates(3, 4);
                            break;
                        case 4:
                            if ((0x3ff000000000000L & l) == 0L)
                                break;
                            if (kind > 50)
                                kind = 50;
                            jjCheckNAdd(4);
                            break;
                        default : break;
                    }
                } while(i != startsAt);
            }
            else if (curChar < 128)
            {
                long l = 1L << (curChar & 077);
                do
                {
                    switch(jjstateSet[--i])
                    {
                        case 5:
                            if ((0x7fffffe87fffffeL & l) != 0L)
                                jjCheckNAddTwoStates(3, 4);
                            if ((0x7fffffe07fffffeL & l) != 0L)
                            {
                                if (kind > 50)
                                    kind = 50;
                                jjCheckNAdd(4);
                            }
                            break;
                        case 0:
                            if ((0x7fffffe07fffffeL & l) == 0L)
                                break;
                            if (kind > 50)
                                kind = 50;
                            jjCheckNAddTwoStates(3, 4);
                            break;
                        case 3:
                            if ((0x7fffffe87fffffeL & l) != 0L)
                                jjCheckNAddTwoStates(3, 4);
                            break;
                        case 4:
                            if ((0x7fffffe07fffffeL & l) == 0L)
                                break;
                            if (kind > 50)
                                kind = 50;
                            jjCheckNAdd(4);
                            break;
                        default : break;
                    }
                } while(i != startsAt);
            }
            else
            {
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do
                {
                    switch(jjstateSet[--i])
                    {
                        default : break;
                    }
                } while(i != startsAt);
            }
            if (kind != 0x7fffffff)
            {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 5 - (jjnewStateCnt = startsAt)))
                return curPos;
            try { curChar = input_stream.readChar(); }
            catch(java.io.IOException e) { return curPos; }
        }
    }
    static final int[] jjnextStates = {
    };

    /** Token literal values. */
    public static final String[] jjstrLiteralImages = {
            "", null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, "\137", "\54", "\73", "\72", "\50", "\51", "\75",
            "\53", "\55", "\52", "\57", "\56", "\76", "\74", "\42", "\47", null, null, null, null, };

    /** Lexer state names. */
    public static final String[] lexStateNames = {
            "DEFAULT",
    };
    static final long[] jjtoToken = {
            0x5ffffffffffe1L,
    };
    static final long[] jjtoSkip = {
            0x1eL,
    };
    protected SimpleCharStream input_stream;
    private final int[] jjrounds = new int[5];
    private final int[] jjstateSet = new int[10];
    protected char curChar;
    /** Constructor. */
    public SQLParserTokenManager(SimpleCharStream stream){
        if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
        input_stream = stream;
    }

    /** Constructor. */
    public SQLParserTokenManager(SimpleCharStream stream, int lexState){
        this(stream);
        SwitchTo(lexState);
    }

    /** Reinitialise parser. */
    public void ReInit(SimpleCharStream stream)
    {
        jjmatchedPos = jjnewStateCnt = 0;
        curLexState = defaultLexState;
        input_stream = stream;
        ReInitRounds();
    }
    private void ReInitRounds()
    {
        int i;
        jjround = 0x80000001;
        for (i = 5; i-- > 0;)
            jjrounds[i] = 0x80000000;
    }

    /** Reinitialise parser. */
    public void ReInit(SimpleCharStream stream, int lexState)
    {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /** Switch to specified lex state. */
    public void SwitchTo(int lexState)
    {
        if (lexState >= 1 || lexState < 0)
            throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
        else
            curLexState = lexState;
    }

    protected Token jjFillToken()
    {
        final Token t;
        final String curTokenImage;
        final int beginLine;
        final int endLine;
        final int beginColumn;
        final int endColumn;
        String im = jjstrLiteralImages[jjmatchedKind];
        curTokenImage = (im == null) ? input_stream.GetImage() : im;
        beginLine = input_stream.getBeginLine();
        beginColumn = input_stream.getBeginColumn();
        endLine = input_stream.getEndLine();
        endColumn = input_stream.getEndColumn();
        t = Token.newToken(jjmatchedKind, curTokenImage);

        t.beginLine = beginLine;
        t.endLine = endLine;
        t.beginColumn = beginColumn;
        t.endColumn = endColumn;

        return t;
    }

    int curLexState = 0;
    int defaultLexState = 0;
    int jjnewStateCnt;
    int jjround;
    int jjmatchedPos;
    int jjmatchedKind;

    /** Get the next Token. */
    public Token getNextToken()
    {
        Token matchedToken;
        int curPos = 0;

        EOFLoop :
        for (;;)
        {
            try
            {
                curChar = input_stream.BeginToken();
            }
            catch(java.io.IOException e)
            {
                jjmatchedKind = 0;
                matchedToken = jjFillToken();
                return matchedToken;
            }

            try { input_stream.backup(0);
                while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
                    curChar = input_stream.BeginToken();
            }
            catch (java.io.IOException e1) { continue EOFLoop; }
            jjmatchedKind = 0x7fffffff;
            jjmatchedPos = 0;
            curPos = jjMoveStringLiteralDfa0_0();
            if (jjmatchedKind != 0x7fffffff)
            {
                if (jjmatchedPos + 1 < curPos)
                    input_stream.backup(curPos - jjmatchedPos - 1);
                if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
                {
                    matchedToken = jjFillToken();
                    return matchedToken;
                }
                else
                {
                    continue EOFLoop;
                }
            }
            int error_line = input_stream.getEndLine();
            int error_column = input_stream.getEndColumn();
            String error_after = null;
            boolean EOFSeen = false;
            try { input_stream.readChar(); input_stream.backup(1); }
            catch (java.io.IOException e1) {
                EOFSeen = true;
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
                if (curChar == '\n' || curChar == '\r') {
                    error_line++;
                    error_column = 0;
                }
                else
                    error_column++;
            }
            if (!EOFSeen) {
                input_stream.backup(1);
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
            }
            throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
        }
    }

    private void jjCheckNAdd(int state)
    {
        if (jjrounds[state] != jjround)
        {
            jjstateSet[jjnewStateCnt++] = state;
            jjrounds[state] = jjround;
        }
    }
    private void jjAddStates(int start, int end)
    {
        do {
            jjstateSet[jjnewStateCnt++] = jjnextStates[start];
        } while (start++ != end);
    }
    private void jjCheckNAddTwoStates(int state1, int state2)
    {
        jjCheckNAdd(state1);
        jjCheckNAdd(state2);
    }

}