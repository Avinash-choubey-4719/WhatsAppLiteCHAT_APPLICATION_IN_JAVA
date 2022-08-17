package com.avinash.whatsapplite.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.avinash.whatsapplite.R;
import com.avinash.whatsapplite.Users;
import com.avinash.whatsapplite.adapters.UserAdapter;
import com.avinash.whatsapplite.databinding.FragmentChatsBinding;
import com.avinash.whatsapplite.databinding.FragmentStatusBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class StatusFragment extends Fragment {

    public StatusFragment() {
        // Required empty public constructor
    }

    FragmentStatusBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentStatusBinding.inflate(inflater , container , false);

        return binding.getRoot();
    }
}