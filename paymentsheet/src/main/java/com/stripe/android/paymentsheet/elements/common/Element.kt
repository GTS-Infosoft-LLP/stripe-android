package com.stripe.android.paymentsheet.elements.common

import kotlinx.coroutines.flow.Flow

/**
 * This class provides the logic behind the fields.
 */
interface Element {
    val label: Int
    val fieldValue: Flow<String>
    val isComplete: Flow<Boolean>
    val errorMessage: Flow<Int?>
}