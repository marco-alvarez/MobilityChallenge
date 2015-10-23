package com.gm.mobilitychallenge;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;


public class FragmentPrimero extends Fragment implements OnClickListener{

    View view;

    public FragmentPrimero(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_primero, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ImageView img_get_ride = (ImageView) view.findViewById(R.id.img_get_ride);
        img_get_ride.setOnClickListener(this);

        ImageView img_offer_ride = (ImageView) view.findViewById(R.id.img_offer_ride);
        img_offer_ride.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_get_ride:
                goToGetRideFragment();
                break;
            case R.id.img_offer_ride:
                goToOfferRideFragment();
                break;
        }
    }

    public void goToGetRideFragment(){
        // Create fragment and give it an argument specifying the article it should show
        FragmentSegundo newFragment = new FragmentSegundo();
                /*Bundle args = new Bundle();
                args.putInt(ArticleFragment.ARG_POSITION, position);
                newFragment.setArguments(args);*/

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack so the user can navigate back
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();
    }

    public void goToOfferRideFragment(){
        // Create fragment and give it an argument specifying the article it should show
        FragmentTercero newFragment = new FragmentTercero();
                /*Bundle args = new Bundle();
                args.putInt(ArticleFragment.ARG_POSITION, position);
                newFragment.setArguments(args);*/

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack so the user can navigate back
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();
    }
}
