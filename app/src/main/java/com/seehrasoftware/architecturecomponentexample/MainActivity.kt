package com.seehrasoftware.architecturecomponentexample

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val EXTRA_TITLE="EXTRA_TITLE"
    val EXTRA_DESCRIPTION="EXTRA_DESCRIPTION"
    val EXTRA_PRIORITY="EXTRA_PRIORITY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_close)
        title = "Add Note"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.add_note_menu, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.save_note -> saveNote()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun saveNote() {
        var title=etTitle.text.toString().trim()
        var description=etDescription.text.toString().trim()
        var priority=etPriority.text.toString().trim()

        if (title.isEmpty() || description.isEmpty() || priority.isEmpty()){
            return
        }

        var intent=Intent()
        intent.putExtra(EXTRA_TITLE,title)
        intent.putExtra(EXTRA_DESCRIPTION,description)
        intent.putExtra(EXTRA_PRIORITY,priority)

        setResult(Activity.RESULT_OK,intent)
        finish()
    }
}
