package pxb.xjimple.expr;

import org.objectweb.asm.Type;

import pxb.xjimple.Local;
import pxb.xjimple.Value;
import pxb.xjimple.Value.VT;
import pxb.xjimple.ValueBox;

public final class Exprs {

    private static ValueBox[] box(Value[] v) {
        if (v == null) {
            return new ValueBox[0];
        }
        ValueBox vb[] = new ValueBox[v.length];
        for (int i = 0; i < v.length; i++) {
            vb[i] = new ValueBox(v[i]);
        }
        return vb;
    }

    public static BinopExpr nAdd(Value a, Value b) {
        return new BinopExpr(VT.ADD, a, b);
    }

    public static BinopExpr nAnd(Value a, Value b) {
        return new BinopExpr(VT.AND, a, b);
    }

    public static ArrayExpr nArray(Value base, Value index) {
        return new ArrayExpr(base, index);
    }

    public static CastExpr nCast(Value obj, Type type) {
        return new CastExpr(obj, type);
    }

    public static BinopExpr nCmp(Value a, Value b) {
        return new BinopExpr(VT.CMP, a, b);
    }

    public static BinopExpr nCmpg(Value a, Value b) {
        return new BinopExpr(VT.CMPG, a, b);
    }

    public static BinopExpr nCmpl(Value a, Value b) {
        return new BinopExpr(VT.CMPL, a, b);
    }

    public static BinopExpr nDiv(Value a, Value b) {
        return new BinopExpr(VT.DIV, a, b);
    }

    public static BinopExpr nEq(Value a, Value b) {
        return new BinopExpr(VT.EQ, a, b);
    }

    public static TypeRefExpr nExceptionRef(Type type) {
        return new TypeRefExpr(VT.EXCEPTION_REF, type, -1);
    }

    public static FieldExpr nField(Value object, Type ownerType, String fieldName, Type fieldType) {
        return new FieldExpr(object, ownerType, fieldName, fieldType);
    }

    public static BinopExpr nGe(Value a, Value b) {
        return new BinopExpr(VT.GE, a, b);
    }

    public static BinopExpr nGt(Value a, Value b) {
        return new BinopExpr(VT.GT, a, b);
    }

    public static InstanceOfExpr nInstanceOf(Value value, Type type) {
        return new InstanceOfExpr(value, type);
    }

    public static InvokeExpr nInvokeInterface(Value obj, Value[] args, Type owner, String name, Type[] argmentTypes,
            Type returnType) {
        return new InvokeExpr(VT.INVOKE_INTERFACE, new ValueBox(obj), box(args), owner, name, argmentTypes, returnType);
    }

    public static InvokeExpr nInvokeNew(Value[] args, Type[] argmentTypes, Type owner) {
        return new InvokeExpr(VT.INVOKE_NEW, null, box(args), owner, "<init>", argmentTypes, owner);
    }

    public static InvokeExpr nInvokeSpecial(Value obj, Value[] args, Type owner, String name, Type[] argmentTypes,
            Type returnType) {
        return new InvokeExpr(VT.INVOKE_SPECIAL, new ValueBox(obj), box(args), owner, name, argmentTypes, returnType);
    }

    public static InvokeExpr nInvokeStatic(Value[] args, Type owner, String name, Type[] argmentTypes, Type returnType) {
        return new InvokeExpr(VT.INVOKE_STATIC, null, box(args), owner, name, argmentTypes, returnType);
    }

    public static InvokeExpr nInvokeVirtual(Value obj, Value[] args, Type owner, String name, Type[] argmentTypes,
            Type returnType) {
        return new InvokeExpr(VT.INVOKE_VIRTUAL, new ValueBox(obj), box(args), owner, name, argmentTypes, returnType);
    }

    public static BinopExpr nLe(Value a, Value b) {
        return new BinopExpr(VT.LE, a, b);
    }

    public static UnopExpr nLength(Value array) {
        return new UnopExpr(VT.LENGTH, array);
    }

    public static Local nLocal(String name, Type type) {
        return new Local(name, type);
    }

    public static BinopExpr nLt(Value a, Value b) {
        return new BinopExpr(VT.LT, a, b);
    }

    public static BinopExpr nMul(Value a, Value b) {
        return new BinopExpr(VT.MUL, a, b);
    }

    public static BinopExpr nNe(Value a, Value b) {
        return new BinopExpr(VT.NE, a, b);
    }

    public static UnopExpr nNEG(Value array) {
        return new UnopExpr(VT.NEG, array);
    }

    // public static NewExpr nNew(Type type) {
    // return new NewExpr(type);
    // }

    public static NewArrayExpr nNewArray(Type type, Value size) {
        return new NewArrayExpr(type, size);
    }

    public static NewMutiArrayExpr nNewMutiArray(Type base, int dim, Value[] sizes) {
        return new NewMutiArrayExpr(base, dim, sizes);
    }

    public static BinopExpr nOr(Value a, Value b) {
        return new BinopExpr(VT.OR, a, b);
    }

    public static TypeRefExpr nParameterRef(Type type, int index) {
        return new TypeRefExpr(VT.PARAMETER_REF, type, index);
    }

    public static BinopExpr nRem(Value a, Value b) {
        return new BinopExpr(VT.REM, a, b);
    }

    public static BinopExpr nShl(Value a, Value b) {
        return new BinopExpr(VT.SHL, a, b);
    }

    public static BinopExpr nShr(Value a, Value b) {
        return new BinopExpr(VT.SHR, a, b);
    }

    public static FieldExpr nStaticField(Type ownerType, String fieldName, Type fieldType) {
        return new FieldExpr(null, ownerType, fieldName, fieldType);
    }

    public static BinopExpr nSub(Value a, Value b) {
        return new BinopExpr(VT.SUB, a, b);
    }

    public static TypeRefExpr nThisRef(Type type) {
        return new TypeRefExpr(VT.THIS_REF, type, -1);
    }

    public static BinopExpr nUshr(Value a, Value b) {
        return new BinopExpr(VT.USHR, a, b);
    }

    public static BinopExpr nXor(Value a, Value b) {
        return new BinopExpr(VT.XOR, a, b);
    }

    private Exprs() {
    }
}
