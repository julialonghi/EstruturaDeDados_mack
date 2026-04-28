public class a {
    FilaCircular<Integer> f = new FilaCircular<Integer>(5);
    Pilha<Integer> p = new Pilha<Integer>(5);
    int cont = 6;

    while (!p.isFull())
        p.push((digitoRA +1)*cont--);

    while (!f.qIsFull())
        f.enqueue(p.pop() % 2);

    p.push(f.dequeue() + f.rear());
    p.push(f.dequeue() + p.topo());

    f.enqueue(p.pop() % 2 + f.front());

    while (!f.qIsEmpty())
        System.out.print(f.dequeue() + " ");
}
