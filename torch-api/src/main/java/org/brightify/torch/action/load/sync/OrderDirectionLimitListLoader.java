package org.brightify.torch.action.load.sync;

/**
 * @author <a href="mailto:tadeas@brightify.org">Tadeas Kriz</a>
 */
public interface OrderDirectionLimitListLoader<ENTITY> extends OrderLoader<ENTITY>, DirectionLoader<ENTITY>,
        LimitLoader<ENTITY>, ListLoader<ENTITY>, Countable {
}