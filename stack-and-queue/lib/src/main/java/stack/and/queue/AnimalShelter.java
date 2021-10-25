package stack.and.queue;

public class AnimalShelter {

    Queue cats = new Queue();
    Queue dogs = new Queue();

    public void enqueue(Animal animal) throws Exception {
        if (animal instanceof Cats) {
            cats.enqueue(animal);
        } else if (animal instanceof Dogs){
            dogs.enqueue(animal);
        }
    }

    public Object dequeue(String pref) throws Exception {
        if (pref.equals("cat")) {
            return cats.dequeue();
        } else  if (pref.equals("dog")) {
            return dogs.dequeue();
        }
        return null;
    }

    @Override
    public String toString() {
        if (cats.empty() && dogs.empty()) {
            return null;
        }
        return "{Dogs :"+ dogs + "} --- {Cats :"+ dogs + "}";
    }

}