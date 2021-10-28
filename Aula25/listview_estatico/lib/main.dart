import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MinhaListaEstatica(),
    );
  }
}

class MinhaListaEstatica extends StatelessWidget {
  //Construtor
  const MinhaListaEstatica({ Key? key }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Meu App de Lista Estática"),
      ),
      body: ListView(
        children: [
          ListTile(
            title: Text("Endeavor"),
            leading: CircleAvatar(
              radius: 24.0,
              child: Image.network("https://miro.medium.com/max/1400/0*4w1BT1OBPoINEywz.jpg", fit: BoxFit.contain,),
            ),
            subtitle: Text("Flamming Hero"),
          ),
          ListTile(
            title: Text("Hawks"),
            leading: CircleAvatar(
              radius: 24.0,
              child: Image.network("https://ovicio.com.br/wp-content/uploads/2021/07/20210712-hawks-talking2-555x555.jpg", fit: BoxFit.contain,),
            ),
            subtitle: Text("Flying Hero"),
          ),
        ],
      ),
    );
  }
}