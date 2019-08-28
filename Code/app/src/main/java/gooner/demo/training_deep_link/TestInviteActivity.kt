package gooner.demo.training_deep_link

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks
import com.google.firebase.appinvite.FirebaseAppInvite

import kotlinx.android.synthetic.main.activity_test_invite.*

class TestInviteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_invite)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        FirebaseDynamicLinks.getInstance()
            .getDynamicLink(intent)
            .addOnCompleteListener { task ->
                if (!task.isSuccessful) {
                    Toast.makeText(this@TestInviteActivity, "Fail", Toast.LENGTH_SHORT)
                }

                val invite = FirebaseAppInvite.getInvitation(task.result)
                if (invite != null) {
                    Toast.makeText(this@TestInviteActivity, "Fail" + invite.invitationId, Toast.LENGTH_SHORT)

                }
            }
    }

}
