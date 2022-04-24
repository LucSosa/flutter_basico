import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Center(child: Text('AppBar')),
      ),
      body: Column(
        children: [
          Container(
            height: 200,
            width: MediaQuery.of(context).size.width,
            decoration: BoxDecoration(color: Colors.blue),
            child: Center(
              child: Text('Olá Mundo!',
                  style: TextStyle(color: Colors.white, fontSize: 30)),
            ),
          ),
          Row(
            children: [
              Container(
                color: Colors.red,
                height: 100,
                width: 200,
                child: Center(
                  child: Text('Container 1'),
                ),
              ),
              Container(
                color: Colors.purple,
                height: 100,
                width: 200,
                child: Center(
                  child: Text('Container 2'),
                ),
              )
            ],
          ),
        ],
      ),
      bottomNavigationBar: BottomNavigationBar(
        items: [
          BottomNavigationBarItem(
            icon: Icon(Icons.local_laundry_service_sharp),
            label: 'Item 1',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.local_laundry_service_sharp),
            label: 'Item 2',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.local_laundry_service_sharp),
            label: 'Item 3',
          )
        ],
      ),
    );
  }
}
