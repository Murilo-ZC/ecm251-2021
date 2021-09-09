package com.company;

public class Sistema {
    private Usuario[] usuarios;

    public Sistema() {
        usuarios = new Usuario[3];
        usuarios[0] = new Usuario("Midoria", 1);
        usuarios[1] = new Usuario("Todoroki", 2);
        usuarios[2] = new Usuario("Bakugo", 3);
    }

    public String pegaNome(int id){
        String nomeEncontrado = "";
        for (Usuario usuario : usuarios) {
            if(usuario.getId() == id)
                nomeEncontrado = usuario.getNome();
        }
        return nomeEncontrado;
    }

    public void rodar(){
        System.out.println("Nome para o id 2:" + pegaNome(2));
        System.out.println("Nome para o id 3:" + pegaNome(3));
        System.out.println("Nome para o id 10:" + pegaNome(10));
    }
}
