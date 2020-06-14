package solver;

public class TestForce {
	public static void main(String[] args) {
		//パラメータ設定
		double[] t_array = new double[] {
				0, 1, 2, 3, 4
		};
		double[] F_array = new double[] {
				10, 15, 13, 11, 8
		};

		double t0 = 0; //0[s]
		double dt = 1e-3; //1e-3[s]
		int n = 10000; //i=0,1,2,...,10000

		double t = t0;
		double f = 0;

		//力のオブジェクト生成
		Force F = new Force(t_array,F_array);

		System.out.println("時刻t,力f");
		for(int i = 0; i <= n; i ++) {
			t = i * dt;
			f = F.value(t);
			System.out.println(t+","+f);
		}

	}
}
