public class CajaSinGenericos {
    Object[] content;

    public CajaSinGenericos() {
    }

    public CajaSinGenericos(Object[] content) {
        this.content = content;
    }

    public void add (int pos, Object objeto){
        content[pos]= objeto;
    }

    public Object get(int pos){
        return content[pos];
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CajaSinGenericos{" +
                "content=" + java.util.Arrays.toString(content) +
                '}';
    }
}
