package com.qp.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {
        String[] frases = {
                "O aleatório não existe, nosso cérebro sempre toma decisões mesmo que ocultas.",
                "Um ato aleatório de bondade, por menor que seja, pode ter um tremendo impacto na vida de outra pessoa.",
                "Faça a pessoa que você gosta se sentir especial ao invés de só mais uma.",
                "A verdade, é que dói lembrar dela.",
                "Cada instante é sempre.",
                "Quem quer vencer um obstáculo deve armar-se da força do leão e da prudência da serpente.",
                "É erro vulgar confundir o desejar com o querer. O desejo mede os obstáculos; a vontade vence-os.",
                "A força não vem de vencer. Suas lutas desenvolvem suas forças. Quando você atravessa dificuldades e decide não se render, isso é força.",
                "A força do desejo da carne facilmente vence as barreiras morais do homem insatisfeito.",
                "O desejo vence o medo, atropela inconvenientes e aplana dificuldades.",
                "Construí amigos, enfrentei derrotas, venci obstáculos, bati na porta da vida e disse-lhe: Não tenho medo de vivê-la.",
                "Quanto maiores são as dificuldades a vencer, maior será a satisfação.",
                "O trabalho persistente vence / tudo, e a miséria que urge nas dificuldades.",
                "A verdadeira amizade supera qualquer desafio, ultrapassa qualquer obstáculo, suporta qualquer dor, nunca te abandona e faz da esperança um oxigênio pra vida.",
                "A teimosia transforma as grandes barreiras em pequenos obstáculos e constrói os grandes vencedores.",
                "Muitos homens devem a grandeza da sua vida aos obstáculos que tiveram que vencer.",
                "Nenhum obstáculo será tão grande se sua vontade de vencer for maior.",
                "Ninguém pode vencer por você, acredite, só você pode derrubar os obstáculos que surgem no seu caminho.",
                "Trabalho a sério, com fé e dedicação, pode fazer você vencer todos os obstáculos e conseguir o que quer!!",
                "O jogo da conquista tem muitos truques e só um desafio: vencer o medo de demonstrar amor.",
                "E o amor sempre prevalece, vence todos os obstáculos e aumenta a cada nova dificuldade encontrada pelo caminho.",
                "Conquistar é transpor barreiras, vencer desafios,e alcançar a vitória almejada na luta do dia a dia.",
                "O homem que vence a si, consegue ultrapassar qualquer limite, qualquer barreira.",
                "Viver é conjugar e vencer desafios; as dificuldades são apenas as molas propulsoras ao êxito em cada conquista.",
                "Nao desista na primeira dificuldade ou você nunca sera um vencedor",
                "Os obstáculos existem para serem vencidos."
        };

        int numero = new Random().nextInt(frases.length);

        TextView texto =  findViewById(R.id.text_resultado);
        texto.setText(frases[numero]);
    }

}
