package edu.ucsb.cs.cs184.urth

import android.util.Log
import com.google.firebase.database.DatabaseReference

object FirebaseUtil {
    private val TAG = FirebaseUtil::class.simpleName

    fun setFirebasePrefs(ref: DatabaseReference, prefs: UserPreferences) {
        ref.setValue(prefs)
            .addOnSuccessListener {
                Log.d(TAG, "Saved local preferences to Firebase")
            }
            .addOnFailureListener {
                Log.e(TAG, "Error saving preferences to Firebase: ${it.message}")
            }
    }
}