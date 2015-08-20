package com.money.manager.ex.investment;

import java.util.List;

/**
 * Interface for security price updater functionality.
 */
public interface ISecurityPriceUpdater {
    /**
     * Download prices for all the securities and update the values.
     * Store the values in the history table.
     */
    void updatePrices(List<String> symbols);
}
