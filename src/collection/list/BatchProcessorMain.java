package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        // MyArrayList<Integer> list = new MyArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        BatchProcessor batchProcessor = new BatchProcessor(list);
        batchProcessor.logic(1_000_000);
    }
}
