public class ControladorLogInLoja {
    private Modelo m;

    public ControladorLogInLoja(Modelo m){
        this.m = m;
    }

    public void run() {
        ControladorLoja loja = new ControladorLoja();
        ViewLogin v = new ViewLogin();
        int o, o2;
        do {
            v.menuLogin();
            v.Op();
            o = Input.lerInt();
            switch (o){
                case 1:
                    v.flush();
                    v.pressioneEnter();
                    v.ID();
                    String u = Input.lerString();
                    v.pass();
                    String p = Input.lerString();
                    if(m.verificaLogin(u,p,0)){
                        v.loginAccep();
                        loja.setC(u);
                        loja.setL(m.getLojas());
                        loja.setU(m.getUtilizadores());
                        loja.run();
                    }
                    else v.LoginDeny();
                    break;
                case 2:
                    v.pressioneEnter();
                    v.flush();
                    v.ID();
                    String c = Input.lerString();
                    if(m.existeLoja(c)){
                        v.siginD();
                        break;
                    }
                    v.pass();
                    String pi = Input.lerString();
                    v.nome();
                    String n = Input.lerString();
                    v.GPS();
                    double x = Input.lerDouble();
                    double y = Input.lerDouble();
                    GPS gps = new GPS(x,y);
                    Loja novo = new Loja(pi,c,n,gps);
                    m.addLoja(novo);
                    v.siginA();

                    v.continuar();
                    o2 = Input.lerInt();
                    continuar(loja, o2);
                    break;
                default:
                    v.printError();
                    break;
            }
        }while (o!=0);
    }

    public boolean verificaLogin(String u, String p){
        return m.verificaLogin(u,p,0);
    }



    public void continuar(ControladorLoja l, int o) {
        ViewLogin v = new ViewLogin();
        if (o == 1) {
            v.pressioneEnter();
            v.flush();
            l.run();
        }
    }
}