import java.util.*;
	class DescendingWeights {
	    static class Weights {
	        int num, wt;
	        public Weights(int num, int wt) {
	            this.num = num;
	            this.wt = wt;
	        }
	    }
	       public static void main(String args[] ) throws Exception {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt(), k = in.nextInt();
	        ArrayList<Weights> nums = new ArrayList<>();
	        for (int i=0;i<n;i++) {
	            int num = in.nextInt();
	            nums.add(new Weights(num, num%k));
	        }
	        Collections.sort(nums, new Comparator<Weights>() {
	            public int compare(Weights a, Weights b) {
	                if (a.wt == b.wt) {
	                    return a.num - b.num;
	                }
	                return b.wt - a.wt;
	            } 
	        });
	        for (int i=0;i<n;i++) {
	            System.out.print(nums.get(i).num+" ");
	        }
	    }
	}