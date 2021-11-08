package com.example.sorcpoints;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class SpellLevelDialog extends AppCompatDialogFragment {
    private EditText editSpellLevel;
    private SpellLevelDialogListener listener;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());

        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_spell_level, null);

        builder.setView(view)
                .setTitle("Spell Level")
                .setNegativeButton("cancel", (dialogInterface, i) -> {

                })
                .setPositiveButton("ok", (dialogInterface, i) -> {
                    int spellLevel = Integer.parseInt(editSpellLevel.getText().toString());
                    listener.applyTexts(spellLevel);
                    MetaMagicDialog.twinSpell();

                });

        editSpellLevel = view.findViewById(R.id.edit_spell_level);

        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            listener = (SpellLevelDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must implement ExampleDialogListener");
        }
    }

    public interface SpellLevelDialogListener {
        void applyTexts(int spellLevel);
    }
}
