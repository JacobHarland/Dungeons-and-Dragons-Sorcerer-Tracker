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

public class SpellToSorcDialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_flexcast_spell_to_sorc_dialog, null);

        builder.setView(view)
                .setTitle("Convert Spell Slots to Sorcery Points ")
                .setNegativeButton("Cancel", (dialogInterface, i) -> {
                });


        Button flexibleCastingFirstLevelSpellSlot = view.findViewById(R.id.flexibleCastingFirstLevelSpellSlot);
        Button flexibleCastingSecondLevelSpellSlot = view.findViewById(R.id.flexibleCastingSecondLevelSpellSlot);
        Button flexibleCastingThirdLevelSpellSlot = view.findViewById(R.id.flexibleCastingThirdLevelSpellSlot);
        Button flexibleCastingFourthLevelSpellSlot = view.findViewById(R.id.flexibleCastingFourthLevelSpellSlot);
        Button flexibleCastingFifthLevelSpellSlot = view.findViewById(R.id.flexibleCastingFifthLevelSpellSlot);

        flexibleCastingFirstLevelSpellSlot.setOnClickListener(view1 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) + 2);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        flexibleCastingSecondLevelSpellSlot.setOnClickListener(view12 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) + 3);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        flexibleCastingThirdLevelSpellSlot.setOnClickListener(view13 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) + 5);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        flexibleCastingFourthLevelSpellSlot.setOnClickListener(view14 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) + 6);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        flexibleCastingFifthLevelSpellSlot.setOnClickListener(view15 -> {
            String newText = Integer.toString(Integer.parseInt(MainActivity.textView.getText().toString()) + 7);
            PrefConfig.saveTotalInPref(getActivity().getApplicationContext(), newText);
            MainActivity.textView.setText(newText);
            dismiss();
        });

        return builder.create();
    }
}
