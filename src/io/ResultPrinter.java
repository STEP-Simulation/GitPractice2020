package io;


/**
 * 解析結果を標準出力へ出力するファイル
 * */
public class ResultPrinter {
	/**
	 * 解析結果を標準出力へ出力します。
	 * 出力のフォーマットはcsv形式
	 * @param t 各ステップの時刻の配列
	 * @param x 各ステップの位置の配列
	 * @param v 各ステップの速度の配列
	 **/
	public void printResult(double[] t, double[] x, double[] v) {

        //csv形式になるように要素を並べる
		System.out.println("時刻t,位置x,速度v");

		//iがt.lengthの範囲内にある限りは値を表示し続ける
	    for (int i = 0; i <= t.length; i++){

	    	System.out.println(t[i]+","+x[i]+","+v[i]);
	    }

	}

}
