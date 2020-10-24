package com.example.calculator;

import android.app.Activity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button zero,one,two,three,four,five,six,seven,eight,nine,
            spot,equal,add,sub,mul,div,genhao,pos_neg,ac,back;
    private EditText editText;//显示输入的数字
    private String opt = "+";//操作符
    private double n1 = 0.0, n2 = 0.0;//两个操作数
    private TextView textView;//显示算式

    //跟据被选择按钮的id设置监听器
    private OnClickListener lisenter = new OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            editText = (EditText)findViewById(R.id.editText1);
            textView = (TextView) findViewById(R.id.textView1);
            String s = editText.getText().toString();//获取字符串
            Button btn =(Button)v;
            try{

                switch(btn.getId())
                {
                    case R.id.one://1
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 1);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.add://+
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "+";
                        textView.setText(n1 + opt);
                        editText.setText("");
                        break;
                    }
                    case R.id.two://2
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 2);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.equal://操作符=
                    {
                        if(opt == "+")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 + n2) + "");
                        }
                        else if(opt == "-")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 - n2) + "");
                        }
                        else if(opt == "*")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 * n2) + "");
                        }
                        else if(opt == "/")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            if(n2 == 0)
                            {
                                editText.setText("");
                                textView.setText("除数不能为0");
                                break;
                            }
                            else
                            {
                                textView.setText(n1 + opt + n2 + "=");
                                editText.setText((n1 / n2) + "");
                            }
                        }

                        break;
                    }
                    case R.id.three://3
                    {
                        editText.setText(editText.getText().toString() + 3);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.four://4
                    {
                        editText.setText(editText.getText().toString() + 4);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.five://5
                    {
                        editText.setText(editText.getText().toString() + 5);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.six://6
                    {
                        editText.setText(editText.getText().toString() + 6);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.seven://7
                    {
                        editText.setText(editText.getText().toString() + 7);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.eight://8
                    {
                        editText.setText(editText.getText().toString() + 8);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.nine://9
                    {
                        editText.setText(editText.getText().toString() + 9);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.zero://0
                    {
                        textView.setText(n1 + opt + 10);
                        editText.setText(editText.getText().toString() + 0);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.spot://.
                    {
                        String str = editText.getText().toString();
                        if(str.indexOf(".") != -1) //判断字符串中是否已经包含了小数点，如果有就什么也不做
                        {

                        }
                        else //如果没有小数点
                        {
                            if(str.equals("0"))//如果开始为0，
                                editText.setText(("0" + ".").toString());
                            else if(str.equals(""))//如果初时显示为空，就什么也不做
                            {

                            }
                            else
                                editText.setText(str + ".");
                        }
                        break;
                    }
                    case R.id.div://操作符 /
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "/";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.mul://操作符*
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "*";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.sub://操作符-
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "-";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.genhao://genhao
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        if(n1 < 0)
                        {
                            editText.setText("");
                            textView.setText("负数没有平方根");
                        }
                        else
                        {
                            editText.setText(Math.sqrt(n1) + "");
                            textView.setText(n1 + "的平方根是");
                        }

                        break;
                    }
                    case R.id.pos_neg://+/-
                    {
                        String str =editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        if(str.length() > 0)
                            editText.setText(-n1 + "");
                        textView.setText(-n1 + "");
                        break;
                    }
                    case R.id.ac://AC
                    {
                        String str =editText.getText().toString();
                        if(str.length() > 0)
                            editText.setText("");
                            textView.setText("");
                        break;
                    }
                    case R.id.back://<-
                    {
                        String str =editText.getText().toString();
                        if(str.length() > 0)
                            editText.setText(str.substring(0, str.length() - 1));
                        break;
                    }

                }
            }catch(Exception e){}
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//onCreate方法的参数是一个Bundle类型的参数。Bundle类型的数据与Map类型的数据相似，都是以key-value的形式存储数据的。
//    从字面上看savedInstanceState，是保存实例状态的。实际上，savedInstanceState也就是保存Activity的状态的。那么，savedInstanceState中的状态数据是从何处而来的呢？下面我们介绍Activity的另一个方法savedInstanceState。
//    onsaveInstanceState方法是用来保存Activity的状态的。当一个Activity在生命周期结束前，会调用该方法保存状态。这个方法有一个参数名称与onCreate方法参数名称相同。如下所示：
//public void onSaveInstanceState(Bundle savedInstanceState){
//super.onSaveInstanceState(savedInsanceState);
//}
//        if (savedInstanceState == null) {
//            getFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment()).commit();
//        }
        //获取按钮的id
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five= (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        genhao = (Button) findViewById(R.id.genhao);
        pos_neg = (Button) findViewById(R.id.pos_neg);
        ac = (Button) findViewById(R.id.ac);
        back = (Button) findViewById(R.id.back);
        spot = (Button) findViewById(R.id.spot);
        equal = (Button) findViewById(R.id.equal);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        //为按钮添加监听器
        zero.setOnClickListener(lisenter);
        one.setOnClickListener(lisenter);
        two.setOnClickListener(lisenter);
        three.setOnClickListener(lisenter);
        four.setOnClickListener(lisenter);
        five.setOnClickListener(lisenter);
        six.setOnClickListener(lisenter);
        seven.setOnClickListener(lisenter);
        eight.setOnClickListener(lisenter);
        nine.setOnClickListener(lisenter);
        genhao.setOnClickListener(lisenter);
        pos_neg.setOnClickListener(lisenter);
        ac.setOnClickListener(lisenter);
        back.setOnClickListener(lisenter);
        spot.setOnClickListener(lisenter);
        equal.setOnClickListener(lisenter);
        add.setOnClickListener(lisenter);
        sub.setOnClickListener(lisenter);
        mul.setOnClickListener(lisenter);
        div.setOnClickListener(lisenter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_main, container,
                    false);
            return rootView;
        }
    }
}