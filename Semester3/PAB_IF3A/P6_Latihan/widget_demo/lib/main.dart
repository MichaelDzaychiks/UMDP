import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'widget demo',
      theme: ThemeData.from( colorScheme: ColorScheme.fromSeed(
          seedColor: Colors.blue,
        ),
        useMaterial3: true,
      ),
      home: const MyHomePage(title: 'widget demo'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  final String title;

  const MyHomePage({super.key, required this.title});

  @override
  State<MyHomePage> createState() => _MyHomePage();
}

class _MyHomePage extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        ),
        body: Column(
          children: [
            Container(
              color: Colors.blue,
              height: 200,
              margin :EdgeInsets.all(16.0),
              padding: EdgeInsets.all(16.0),
              child: Text(
                'Ini adalah contoh Penggunaan Container',
                style: TextStyle(
                  color: Colors.white,
                  fontSize:20.0,
                )
              ),
            ),
            ElevatedButton
            (
              onPressed: () { 

              },
              child: Text('Tombol Elevated'),
              ),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              
              children: [
                Icon(Icons.star, color: Colors.amber),
                Text('Rating: 4.5'),
              ],
            ),
            Image.network('https://picsum.photos/id/7/300/200',
            width: 200,
            height: 150,
            ),
          ],
          
        )
    );
  }
}