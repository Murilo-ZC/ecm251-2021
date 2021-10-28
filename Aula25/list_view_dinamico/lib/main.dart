import 'package:flutter/material.dart';
import 'package:list_view_dinamico/network_helper.dart';
import 'package:list_view_dinamico/pessoa.dart';
import 'package:list_view_dinamico/random_users.dart';

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
      home: const MinhaListaDinamica(),
    );
  }
}

class MinhaListaDinamica extends StatefulWidget {
  const MinhaListaDinamica({ Key? key }) : super(key: key);

  @override
  State<MinhaListaDinamica> createState() => _MinhaListaDinamicaState();
}

class _MinhaListaDinamicaState extends State<MinhaListaDinamica> {
  List<Pessoa> pessoas = [Pessoa(nome: "Pikachu", url: "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png", subText: "Elétrico"),
  Pessoa(nome: "Raichu", url: "https://assets.pokemon.com/assets/cms2/img/pokedex/full/026.png", subText: "Elétrico"),
  Pessoa(nome: "Sandchurew", url: "https://assets.pokemon.com/assets/cms2/img/pokedex/full/027.png", subText: "Terrestre"),
  
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Minha Lista Dinâmica"),),
      body: ListView.builder(
        itemCount: pessoas.length,
        itemBuilder: (context, itemIndex){
          return ListTile(
            title: Text("${pessoas[itemIndex].nome}"),
            leading: Image.network("${pessoas[itemIndex].url}"),
            subtitle: Text("${pessoas[itemIndex].subText}"),
          ); 
        },
      ),  
      floatingActionButton: FloatingActionButton(
        onPressed: ()async{
          NetworkHelper helper = NetworkHelper(url:"https://randomuser.me/api/?results=10");
          RandomUsers randomUsers = RandomUsers.fromJson(await helper.getData());
          //Colocar mais usuários
          randomUsers.results!.forEach((element) {
            pessoas.add(
              Pessoa(nome: "${element.name!.first} ${element.name!.last}",
              subText: element.email!, 
              url: element.picture!.medium!)
            );
          });
          setState(() {});
        },
        child: Icon(Icons.search_sharp),
      ),     
    );
  }
}
