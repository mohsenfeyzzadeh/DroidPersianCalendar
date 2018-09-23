package com.byagowi.persiancalendar.di.modules;

import com.byagowi.persiancalendar.di.scopes.PerFragment;
import com.byagowi.persiancalendar.view.dialog.preferredcalendars.CalendarPreferenceDialog;
import com.byagowi.persiancalendar.view.fragment.AboutFragment;
import com.byagowi.persiancalendar.view.fragment.CalendarFragment;
import com.byagowi.persiancalendar.view.fragment.CompassFragment;
import com.byagowi.persiancalendar.view.fragment.ConverterFragment;
import com.byagowi.persiancalendar.view.preferences.FragmentInterfaceCalendar;
import com.byagowi.persiancalendar.view.preferences.FragmentLocationAthan;
import com.byagowi.persiancalendar.view.preferences.FragmentWidgetNotification;
import com.byagowi.persiancalendar.view.preferences.GPSLocationDialog;
import com.byagowi.persiancalendar.view.preferences.SettingsFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = CalendarFragmentModule.class)
    abstract CalendarFragment calendarFragmentInjector();

    @PerFragment
    @ContributesAndroidInjector
    abstract SettingsFragment settingsFragmentInjector();

    @PerFragment
    @ContributesAndroidInjector
    abstract CompassFragment compassFragmentInjector();

    @PerFragment
    @ContributesAndroidInjector
    abstract AboutFragment aboutFragmentInjector();

    @PerFragment
    @ContributesAndroidInjector
    abstract ConverterFragment converterFragmentInjector();

    @PerFragment
    @ContributesAndroidInjector
    abstract FragmentLocationAthan fragmentLocationAthanInjector();

    @PerFragment
    @ContributesAndroidInjector
    abstract FragmentInterfaceCalendar fragmentInterfaceCalendarInjector();

    @PerFragment
    @ContributesAndroidInjector
    abstract CalendarPreferenceDialog calendarPreferenceDialogInjector();

    @PerFragment
    @ContributesAndroidInjector
    abstract GPSLocationDialog gpsLocationDialogInjector();

    @PerFragment
    @ContributesAndroidInjector
    abstract FragmentWidgetNotification fragmentWidgetNotificationInjector();
}
