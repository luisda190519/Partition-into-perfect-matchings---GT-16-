
# Partition into perfect matchings

The problem of partitioning a graph into "perfect" pairings is a fairly recurrent problem in graph theory. This concept in the mathematical discipline of graph theory, a pairing or set of independent edges in an undirected graph is a set of edges without common vertices. A problem that has its applications in real life and that its solution and optimization is of vital importance.

Given a graph G=(V,E), the problem is to partition the graph G, into k partitions, where kK, these partitions must be made by a perfect pairing Vi, where 1ViK, These pairings have to satisfy the property that no two edges in M share the same node. And M must have half the vertices of the network, i.e. V/2, this can be best visualized as follows. 

Given the following graph:

![Imagen](https://github.com/luisda190519/Partition-into-perfect-matchings---GT-16-/blob/main/imagenes/1.png?raw=true)

When partitioning it into perfect matches, you would be like this:

![Imagen](https://github.com/luisda190519/Partition-into-perfect-matchings---GT-16-/blob/main/imagenes/2.png?raw=true)

There are 2 pairs that do not share edges, and the number of edges is V/2, that is 4/2 = 2, so it is confirmed that it is indeed a partition in perfect pairs.
## Features

- Plot graphically by creating node by node and their intersections.
- Plot randomly
- Plot by text file with adjacency matrix



## Usage

The java program looks like this:

![Image](https://github.com/luisda190519/Partition-into-perfect-matchings---GT-16-/blob/main/imagenes/3.png?raw=true)

Where the user can click on the screen to add nodes and join them, at the same time the program generates the adjacency matrix associated to the graph, then when applying the perfect partitioning algorithm, it looks like this:

![Image](https://github.com/luisda190519/Partition-into-perfect-matchings---GT-16-/blob/main/imagenes/4.png?raw=true)

This immediately shows that every k-regular graph can be partitioned into perfect pairings and that every k-regular bipartite graph has a perfect pairing.

Another way to draw the graph without having to do it by clicking on the screen is to have a file with the adjacency matrix, this file should have the following form:

0 1 1 1 1 1  
1 0 1 1 1 1  
1 1 0 1 1 1   
1 1 1 0 1 1  
1 1 1 1 0 1  
1 1 1 1 1 0

To add this file adjacency matrix to the program, click on the open file button and look for the file in the PC folders.

![Image](https://github.com/luisda190519/Partition-into-perfect-matchings---GT-16-/blob/main/imagenes/5.png?raw=true)

This will draw the nodes of the adjacency matrix, and then press perfect partition.

![Image](https://github.com/luisda190519/Partition-into-perfect-matchings---GT-16-/blob/main/imagenes/6.png?raw=true)

The program for large input values also works, for example for a 15-complete graph, the program displays the following.

![Image](https://github.com/luisda190519/Partition-into-perfect-matchings---GT-16-/blob/main/imagenes/7.png?raw=true)

And when applying the algorithm it looks like this:

![Image](https://github.com/luisda190519/Partition-into-perfect-matchings---GT-16-/blob/main/imagenes/8.png?raw=true)

The algorithm can accept much more nodes, but certainly the visual appearance of the generated graph will get worse.

To test for n complete graphs, click on the program.

![Image](https://github.com/luisda190519/Partition-into-perfect-matchings---GT-16-/blob/main/imagenes/9.png?raw=true)

Then type n, which is the number of tests, the program will make a complete graph from 2 to n and for each graph it applies the perfect partition algorithm, and then it will create two excel files with the times of the improved algorithm and the unimproved algorithm, this table is the one used for the hypothesis test.




## Support

For support, email licerol@uninorte.edu.co


## 🛠 Skills
JAVA
