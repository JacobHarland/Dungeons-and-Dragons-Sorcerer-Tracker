package com.example.sorcpoints;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class MetaMagicDialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_metamagic_dialog, null);

        builder.setView(view)
                .setTitle("Metamagic Options")
                .setNegativeButton("Cancel", (dialogInterface, i) -> {
                });


        Button carefulSpell = view.findViewById(R.id.carefulSpell);
        Button distantSpell = view.findViewById(R.id.distantSpell);
        Button empoweredSpell = view.findViewById(R.id.empoweredSpell);
        Button extendedSpell = view.findViewById(R.id.extendedSpell);
        Button heightenedSpell = view.findViewById(R.id.heightenedSpell);
        Button quickenedSpell = view.findViewById(R.id.quickenedSpell);
        Button subtleSpell = view.findViewById(R.id.subtleSpell);
        Button twinnedSpell = view.findViewById(R.id.twinnedSpell);

        carefulSpell.setOnClickListener(view1 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 1);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        distantSpell.setOnClickListener(view12 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 1);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        empoweredSpell.setOnClickListener(view13 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 1);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        extendedSpell.setOnClickListener(view14 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 1);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        heightenedSpell.setOnClickListener(view15 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 3);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        quickenedSpell.setOnClickListener(view13 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 2);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        subtleSpell.setOnClickListener(view14 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 1);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        twinnedSpell.setOnClickListener(view15 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 10);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });
        return builder.create();
    }
}