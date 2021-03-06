package com.lime.mypol.statics;

import android.content.Context;
import android.content.Intent;

import com.lime.mypol.activity.AssemblymenListActivity;
import com.lime.mypol.activity.BillListActivity;
import com.lime.mypol.activity.HallOfFameActivity;
import com.lime.mypol.activity.MypageActivity;
import com.lime.mypol.activity.PublicOpinionsActivity;
import com.lime.mypol.vo.MemberInfo;

/**
 * Created by Administrator on 2015-07-21.
 */
public class AMWStatic {

    public static void viewSubActivity(Context context, int position, MemberInfo memberInfo){
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(context, AssemblymenListActivity.class);
                break;
            case 1:
                intent = new Intent(context, BillListActivity.class);
                break;
            case 2:
                intent = new Intent(context, HallOfFameActivity.class);
                break;
            case 3:
                intent = new Intent(context, PublicOpinionsActivity.class);
                break;
            case 4:
                intent = new Intent(context, MypageActivity.class);
                break;
        }
        intent.putExtra("memberInfo", memberInfo);
        context.startActivity(intent);
    }
}
