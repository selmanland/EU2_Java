package review_sessions_week10_review;

public class ForEach {

	public static void main(String[] args) {
		
		int[] nums = {5, 6, 11, 725, 90};
        double[] prices = {19.99, 23.5, 9.99, 5.99, 102.5};

        for(int itDoesNotMatter : nums ) {
            System.out.print(itDoesNotMatter +" ");
        }
        System.out.println();
        for(double price : prices){
            System.out.print(price+" ");
        }

	}

}
