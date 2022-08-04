package com.sabsrocambole.starwars15.model;

import com.sabsrocambole.starwars15.service.HTTPService;

import java.util.concurrent.ExecutionException;

public class ListaPessoas {

    private String pessoasID;

    private String pessoa1;
    private String pessoa2;
    private String pessoa3;
    private String pessoa4;
    private String pessoa5;
    private String pessoa6;
    private String pessoa7;
    private String pessoa8;
    private String pessoa9;
    private String pessoa10;
    private String pessoa11;
    private String pessoa12;
    private String pessoa13;
    private String pessoa14;
    private String pessoa15;
    private String pessoa16;
    private String pessoa17;
    private String pessoa18;
    private String pessoa19;
    private String pessoa20;



    public ListaPessoas(String pessoasID) {
        this.pessoasID = pessoasID;
        this.pessoa1 = pessoa1;
        this.pessoa2 = pessoa2;
        this.pessoa3 = pessoa3;
        this.pessoa4 = pessoa4;
        this.pessoa5 = pessoa5;
        this.pessoa6 = pessoa6;
        this.pessoa7 = pessoa7;
        this.pessoa8 = pessoa8;
        this.pessoa9 = pessoa9;
        this.pessoa10 = pessoa10;
        this.pessoa11 = pessoa11;
        this.pessoa12 = pessoa12;
        this.pessoa13 = pessoa13;
        this.pessoa14 = pessoa14;
        this.pessoa15 = pessoa15;
        this.pessoa16 = pessoa16;
        this.pessoa17 = pessoa17;
        this.pessoa18 = pessoa18;
        this.pessoa19 = pessoa19;
        this.pessoa20 = pessoa20;
    }

    public String getPessoasID() {
        return pessoasID;
    }

    public void setPessoasID(String pessoasID) {
        this.pessoasID = pessoasID;
    }

    //LUKE
    public String getPessoa1() {
        pessoasID = "1";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa1 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa1;
    }

    public void setPessoa1(String pessoa1) {
        this.pessoa1 = pessoa1;
    }

    //C-3PO
    public String getPessoa2() {
        pessoasID = "2";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa2 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa2;
    }

    public void setPessoa2(String pessoa2) {
        this.pessoa2 = pessoa2;
    }

    //R2-D2
    public String getPessoa3() {
        pessoasID = "3";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa3 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa3;
    }

    public void setPessoa3(String pessoa3) {
        this.pessoa3 = pessoa3;
    }


    //Darth Vader
    public String getPessoa4() {
        pessoasID = "4";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa4 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa4;
    }

    public void setPessoa4(String pessoa4) {
        this.pessoa4 = pessoa4;
    }


    //Leia Organa
    public String getPessoa5() {
        pessoasID = "5";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa5 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa5;
    }

    public void setPessoa5(String pessoa5) {
        this.pessoa5 = pessoa5;
    }

    //Owen Lars
    public String getPessoa6() {
        pessoasID = "6";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa6 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa6;
    }

    public void setPessoa6(String pessoa6) {
        this.pessoa6 = pessoa6;
    }

    //Beru Whitesun Lars
    public String getPessoa7() {
        pessoasID = "7";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa7 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa7;
    }

    public void setPessoa7(String pessoa7) {
        this.pessoa7 = pessoa7;
    }

    //R5-D4
    public String getPessoa8() {
        pessoasID = "8";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa8 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa8;
    }

    public void setPessoa8(String pessoa8) {
        this.pessoa8 = pessoa8;
    }


    //Biggs Darklighter
    public String getPessoa9() {
        pessoasID = "9";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa9 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa9;
    }

    public void setPessoa9(String pessoa9) {
        this.pessoa9 = pessoa9;
    }

    //Obi-Wan Kenobi
    public String getPessoa10() {
        pessoasID = "10";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa10 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa10;
    }

    public void setPessoa10(String pessoa10) {
        this.pessoa10 = pessoa10;
    }


    //Anakin Skywalker
    public String getPessoa11() {
        pessoasID = "11";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa11 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa11;
    }

    public void setPessoa11(String pessoa11) {
        this.pessoa11 = pessoa11;
    }

    //Wilhuff Tarkin
    public String getPessoa12() {
        pessoasID = "12";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa12 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa12;
    }

    public void setPessoa12(String pessoa12) {
        this.pessoa12 = pessoa12;
    }


    //Chewbacca
    public String getPessoa13() {
        pessoasID = "13";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa13 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa13;
    }

    public void setPessoa13(String pessoa13) {
        this.pessoa13 = pessoa13;
    }


    //Han Solo
    public String getPessoa14() {
        pessoasID = "14";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa14 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa14;
    }

    public void setPessoa14(String pessoa14) {
        this.pessoa14 = pessoa14;
    }


    //Greedo
    public String getPessoa15() {
        pessoasID = "15";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa15 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa15;
    }

    public void setPessoa15(String pessoa15) {
        this.pessoa15 = pessoa15;
    }

    //Jabba Desilijic Tiure
    public String getPessoa16() {
        pessoasID = "16";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa16 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa16;
    }

    public void setPessoa16(String pessoa16) {
        this.pessoa16 = pessoa16;
    }


    //Wedge Antille
    public String getPessoa17() {
        pessoasID = "18";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa17 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa17;
    }

    public void setPessoa17(String pessoa17) {
        this.pessoa17 = pessoa17;
    }


    //Jek Tono Porkins
    public String getPessoa18() {
        pessoasID = "19";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa18 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa18;
    }

    public void setPessoa18(String pessoa18) {
        this.pessoa18 = pessoa18;
    }


    //YODA
    public String getPessoa19() {
        pessoasID = "20";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa19 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa19;
    }

    public void setPessoa19(String pessoa19) {
        this.pessoa19 = pessoa19;
    }


    //Palpatine
    public String getPessoa20() {
        pessoasID = "21";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            pessoa20 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pessoa20;
    }

    public void setPessoa20(String pessoa20) {
        this.pessoa20 = pessoa20;
    }

    @Override
    public String toString() {
        return "ListaPessoas{" +
                "pessoasID='" + pessoasID + '\'' +
                ", pessoa1='" + pessoa1 + '\'' +
                ", pessoa2='" + pessoa2 + '\'' +
                ", pessoa3='" + pessoa3 + '\'' +
                ", pessoa4='" + pessoa4 + '\'' +
                ", pessoa5='" + pessoa5 + '\'' +
                ", pessoa6='" + pessoa6 + '\'' +
                ", pessoa7='" + pessoa7 + '\'' +
                ", pessoa8='" + pessoa8 + '\'' +
                ", pessoa9='" + pessoa9 + '\'' +
                ", pessoa10='" + pessoa10 + '\'' +
                ", pessoa11='" + pessoa11 + '\'' +
                ", pessoa12='" + pessoa12 + '\'' +
                ", pessoa13='" + pessoa13 + '\'' +
                ", pessoa14='" + pessoa14 + '\'' +
                ", pessoa15='" + pessoa15 + '\'' +
                ", pessoa16='" + pessoa16 + '\'' +
                ", pessoa17='" + pessoa17 + '\'' +
                ", pessoa18='" + pessoa18 + '\'' +
                ", pessoa19='" + pessoa19 + '\'' +
                ", pessoa20='" + pessoa20 + '\'' +
                '}';
    }
}
