package io.github.jonaskahn.assistant

import java.util.*

class Language {
    companion object {
        private val resourceBundles: Map<String, ResourceBundle> = mapOf(
            "en" to ResourceBundle.getBundle("messages", Locale.ENGLISH),
            "en_US" to ResourceBundle.getBundle("messages", Locale.ENGLISH),
            "vi" to ResourceBundle.getBundle("messages", Locale.of("vi")),
            "vi_VN" to ResourceBundle.getBundle("messages", Locale.of("vi"))
        )

        fun of(language: String?, key: String?): String? {
            if (key == null) return null
            val bundle: ResourceBundle? = resourceBundles[language] ?: resourceBundles["en"]
            return bundle?.getString(key) ?: key
        }
    }
}