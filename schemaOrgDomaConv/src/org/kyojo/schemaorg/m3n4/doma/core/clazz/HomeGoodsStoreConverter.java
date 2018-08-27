package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HOME_GOODS_STORE;
import org.kyojo.schemaorg.m3n4.core.Clazz.HomeGoodsStore;

@ExternalDomain
public class HomeGoodsStoreConverter implements DomainConverter<HomeGoodsStore, String> {

	@Override
	public String fromDomainToValue(HomeGoodsStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public HomeGoodsStore fromValueToDomain(String value) {
		return new HOME_GOODS_STORE(value);
	}

}
