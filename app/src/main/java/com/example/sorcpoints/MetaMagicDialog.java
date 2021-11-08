package com.example.sorcpoints;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class MetaMagicDialog extends AppCompatDialogFragment implements SpellLevelDialog.SpellLevelDialogListener {

    private static Context context = null;
    public static int spellLevel0 = 0;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());

        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_metamagic_dialog, null);

        context = requireActivity();

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
            if (Integer.parseInt(MainActivity.textView.getText().toString()) >= 1) {
                String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 1);
                PrefConfig.saveTotalInPref(requireActivity().getApplicationContext(), newText);
                MainActivity.textView.setText(newText);
                dismiss();
            }
        });

        distantSpell.setOnClickListener(view12 -> {
            if (Integer.parseInt(MainActivity.textView.getText().toString()) >= 1) {
                String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 1);
                PrefConfig.saveTotalInPref(requireActivity().getApplicationContext(), newText);
                MainActivity.textView.setText(newText);
                dismiss();
            }
        });

        empoweredSpell.setOnClickListener(view13 -> {
            if (Integer.parseInt(MainActivity.textView.getText().toString()) >= 1) {
                String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 1);
                PrefConfig.saveTotalInPref(requireActivity().getApplicationContext(), newText);
                MainActivity.textView.setText(newText);
                dismiss();
            }
        });

        extendedSpell.setOnClickListener(view14 -> {
            if (Integer.parseInt(MainActivity.textView.getText().toString()) >= 1) {
                String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 1);
                PrefConfig.saveTotalInPref(requireActivity().getApplicationContext(), newText);
                MainActivity.textView.setText(newText);
                dismiss();
            }
        });

        heightenedSpell.setOnClickListener(view15 -> {
            if (Integer.parseInt(MainActivity.textView.getText().toString()) >= 3) {
                String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 3);
                PrefConfig.saveTotalInPref(requireActivity().getApplicationContext(), newText);
                MainActivity.textView.setText(newText);
                dismiss();
            }
        });

        quickenedSpell.setOnClickListener(view13 -> {
            if (Integer.parseInt(MainActivity.textView.getText().toString()) >= 2) {
                String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 2);
                PrefConfig.saveTotalInPref(requireActivity().getApplicationContext(), newText);
                MainActivity.textView.setText(newText);
                dismiss();
            }
        });

        subtleSpell.setOnClickListener(view14 -> {
            if (Integer.parseInt(MainActivity.textView.getText().toString()) >= 1) {
                String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - 1);
                PrefConfig.saveTotalInPref(requireActivity().getApplicationContext(), newText);
                MainActivity.textView.setText(newText);
                dismiss();
            }
        });

        twinnedSpell.setOnClickListener(view15 -> {

            SpellLevelDialog spellLevelDialog = new SpellLevelDialog();
            spellLevelDialog.show(requireActivity().getSupportFragmentManager(), "spell level dialog");
            dismiss();

        });
        return builder.create();
    }

    @Override
    public void applyTexts(int spellLevel) {

    }

    public static void twinSpell() {
        if (Integer.parseInt(MainActivity.textView.getText().toString()) >= spellLevel0) {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) - spellLevel0);
            //PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            PrefConfig.saveTotalInPref(context, newText);
            MainActivity.textView.setText(newText);
        }
    }
}